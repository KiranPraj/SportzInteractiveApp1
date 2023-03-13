package com.example.sportzinteractiveapp.model

data class SecondMatchData(
    val Matchdetail: Matchdetails,
    val Teams: Teamss
) {
    data class Matchdetails(
        val Equation: String,
        val Match: Matchs,
        val Officials: Officialss,
        val Player_Match: String,
        val Result: String,
        val Series: Seriess,
        val Status: String,
        val Status_Id: String,
        val Team_Away: String,
        val Team_Home: String,
        val Tosswonby: String,
        val Venue: Venues,
        val Weather: String,
        val Winmargin: String,
        val Winningteam: String
    )
    {
        data class Matchs(
            val Code: String,
            val Date: String,
            val Daynight: String,
            val Id: String,
            val League: String,
            val Livecoverage: String,
            val Number: String,
            val Offset: String,
            val Time: String,
            val Type: String
        )

        data class Officialss(
            val Referee: String,
            val Umpires: String
        )

        data class Seriess(
            val Id: String,
            val Name: String,
            val Status: String,
            val Tour: String,
            val Tour_Name: String
        )

        data class Venues(
            val Id: String,
            val Name: String
        )
    }

    data class Teamss(
        val `4`: X4,
        val `5`: X5
    ) {
        data class X4(
            val Name_Full: String,
            val Name_Short: String,
            val Players: Playerss
        ) {
            data class Playerss(
                val `3632`: X3632,
                val `3722`: X3722,
                val `3852`: X3852,
                val `4176`: X4176,
                val `4532`: X4532,
                val `5132`: X5132,
                val `63187`: X63187,
                val `63751`: X63751,
                val `65867`: X65867,
                val `66818`: X66818,
                val `9844`: X9844
            ) {
                data class X3632(
                    val Batting: Batting1,
                    val Bowling: Bowling1,
                    val Iskeeper: Boolean,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting1(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling1(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X3722(
                    val Batting: Batting2,
                    val Bowling: Bowling2,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting2(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling2(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X3852(
                    val Batting: Batting3,
                    val Bowling: Bowling3,
                    val Iscaptain: Boolean,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting3(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling3(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X4176(
                    val Batting: Batting4,
                    val Bowling: Bowling4,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting4(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling4(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X4532(
                    val Batting: Batting5,
                    val Bowling: Bowling5,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting5(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling5(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X5132(
                    val Batting: Batting6,
                    val Bowling: Bowling6,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting6(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling6(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X63187(
                    val Batting: Batting7,
                    val Bowling: Bowling7,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting7(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling7(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X63751(
                    val Batting: Batting8,
                    val Bowling: Bowling8,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting8(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling8(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X65867(
                    val Batting: Batting9,
                    val Bowling: Bowling9,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting9(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling9(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X66818(
                    val Batting: Batting10,
                    val Bowling: Bowling10,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting10(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling10(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X9844(
                    val Batting: Batting11,
                    val Bowling: Bowling11,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting11(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling11(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }
            }
        }

        data class X5(
            val Name_Full: String,
            val Name_Short: String,
            val Players: Playerss
        ) {
            data class Playerss(
                val `10167`: X10167,
                val `10172`: X10172,
                val `11703`: X11703,
                val `11706`: X11706,
                val `3752`: X3752,
                val `4330`: X4330,
                val `4338`: X4338,
                val `4964`: X4964,
                val `57594`: X57594,
                val `57903`: X57903,
                val `60544`: X60544
            ) {
                data class X10167(
                    val Batting: Batting1,
                    val Bowling: Bowling1,
                    val Iskeeper: Boolean,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting1(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling1(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X10172(
                    val Batting: Batting2,
                    val Bowling: Bowling2,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting2(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling2(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X11703(
                    val Batting: Batting3,
                    val Bowling: Bowling3,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting3(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling3(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X11706(
                    val Batting: Batting4,
                    val Bowling: Bowling4,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting4(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling4(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X3752(
                    val Batting: Batting5,
                    val Bowling: Bowling5,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting5(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling5(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X4330(
                    val Batting: Batting6,
                    val Bowling: Bowling6,
                    val Iscaptain: Boolean,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting6(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling6(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X4338(
                    val Batting: Batting7,
                    val Bowling: Bowling7,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting7(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling7(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X4964(
                    val Batting: Batting8,
                    val Bowling: Bowling8,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting8(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling8(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X57594(
                    val Batting: Batting9,
                    val Bowling: Bowling9,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting9(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling9(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X57903(
                    val Batting: Batting10,
                    val Bowling: Bowling10,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting10(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling10(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }

                data class X60544(
                    val Batting: Batting11,
                    val Bowling: Bowling11,
                    val Name_Full: String,
                    val Position: String
                ) {
                    data class Batting11(
                        val Average: String,
                        val Runs: String,
                        val Strikerate: String,
                        val Style: String
                    )

                    data class Bowling11(
                        val Average: String,
                        val Economyrate: String,
                        val Style: String,
                        val Wickets: String
                    )
                }
            }
        }
    }
}