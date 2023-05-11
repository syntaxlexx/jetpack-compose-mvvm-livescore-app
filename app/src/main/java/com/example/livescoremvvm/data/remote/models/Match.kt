package com.example.livescoremvvm.data.remote.models

data class Match(
    val leagueName: String,
    val idHome: Int,
    val homeName: String,
    val idAway: Int,
    val awayName: String,
    val date: String,
    val status: String,
    val team_home_90min_goals: Int,
    val away_home_90min_goals: Int,
    val elapsed: Int
)