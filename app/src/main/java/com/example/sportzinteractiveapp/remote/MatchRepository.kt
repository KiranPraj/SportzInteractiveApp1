package com.example.sportzinteractiveapp.remote

class MatchRepository constructor(private val retrofitService: RetrofitService) {
    suspend fun getAllMatchDetails()=retrofitService.getMatchDetails()
    suspend fun getSecondMatchDetails()=retrofitService.getSecondMatchDetails()


}