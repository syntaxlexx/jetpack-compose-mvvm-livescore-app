package com.example.livescoremvvm.viewmodel.state

import com.example.livescoremvvm.data.remote.models.Match

sealed class MatchesState {
    object Empty: MatchesState()
    object Loading: MatchesState()
    class Success(val data: List<Match>): MatchesState()
    class Error(val message: String): MatchesState()
}
