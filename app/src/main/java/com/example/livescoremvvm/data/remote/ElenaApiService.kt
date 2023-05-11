package com.example.livescoremvvm.data.remote

import com.example.livescoremvvm.data.remote.models.InplayMatchesResponse
import com.example.livescoremvvm.util.GET_INPLAY_FIXTURES
import retrofit2.http.GET

interface ElenaApiService {
    @GET(GET_INPLAY_FIXTURES)
    suspend fun getInplayMatches() : InplayMatchesResponse
}