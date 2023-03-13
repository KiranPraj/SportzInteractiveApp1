package com.example.sportzinteractiveapp.remote
import com.example.sportzinteractiveapp.model.newmodel.MatchResponse
import com.example.sportzinteractiveapp.model.newmodel.Matchdetail


import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {

    @GET("sapk01222019186652.json")
    suspend fun getMatchDetails():Response<MatchResponse>

    @GET("nzin01312019187360.json")
    suspend fun getSecondMatchDetails():Response<MatchResponse>


}