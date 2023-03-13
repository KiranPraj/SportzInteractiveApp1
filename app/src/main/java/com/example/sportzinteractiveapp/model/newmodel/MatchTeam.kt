package com.example.sportzinteractiveapp.model.newmodel

data class MatchTeam(
    val Name_Full: String,
    val Name_Short: String,
    val Players: HashMap<String,TeamPlayer>
)