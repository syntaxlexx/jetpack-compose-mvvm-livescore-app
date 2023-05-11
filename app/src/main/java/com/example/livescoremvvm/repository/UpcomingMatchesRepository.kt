package com.example.livescoremvvm.repository

import com.example.livescoremvvm.data.remote.ElenaApiService
import com.example.livescoremvvm.data.remote.models.Match
import javax.inject.Inject

class UpcomingMatchesRepository @Inject constructor(private val elenaApiService: ElenaApiService) {
    suspend fun getAllUpcomingMatches() : List<Match> = elenaApiService.getUpcomingMatches().data
}
