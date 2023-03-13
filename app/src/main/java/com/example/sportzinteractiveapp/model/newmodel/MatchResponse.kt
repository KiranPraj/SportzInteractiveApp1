package com.example.sportzinteractiveapp.model.newmodel

data class MatchResponse(
    val Innings: List<Inning>,
    val Matchdetail: Matchdetail,
    val Notes: Notes,
    val Nuggets: List<String>,
    val Teams: HashMap<String,MatchTeam>
)