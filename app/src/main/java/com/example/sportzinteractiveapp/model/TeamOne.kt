package com.example.sportzinteractiveapp.model



data class TeamOne(
    val matachData: MatchData,
    val secondMatchData: SecondMatchData,
    val type:Int

){
    val RESPONSE_ONE_TYPE=1
    val RESPONSE_SECOND_TYPE=2

}
