package com.example.livescoremvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.livescoremvvm.repository.UpcomingMatchesRepository
import com.example.livescoremvvm.viewmodel.state.MatchesState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

@HiltViewModel
class UpcomingMatchesViewModel @Inject constructor(private val upcomingMatchesRepository: UpcomingMatchesRepository) : ViewModel() {
    private val _upcomingMatchesState = MutableStateFlow<MatchesState>(MatchesState.Empty)
    val upcomingMatchesState: StateFlow<MatchesState> = _upcomingMatchesState

    init {
        getAllUpcomingMatches()
    }

    private fun getAllUpcomingMatches() {
        _upcomingMatchesState.value = MatchesState.Loading

        viewModelScope.launch(Dispatchers.IO) {
            try {
                val upcomingMatchesResponse = upcomingMatchesRepository.getAllUpcomingMatches()
                _upcomingMatchesState.value = MatchesState.Success(upcomingMatchesResponse)
            }
            catch (exception: HttpException) {
                _upcomingMatchesState.value = MatchesState.Error("No internet connection")
            }
            catch (exception: IOException) {
                _upcomingMatchesState.value = MatchesState.Error("Something went wrong!")
            }
        }
    }
}