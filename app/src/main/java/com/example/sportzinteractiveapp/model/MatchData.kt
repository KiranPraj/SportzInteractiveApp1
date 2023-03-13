package com.example.sportzinteractiveapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import java.io.Serializable


data class MatchData(
    val Matchdetail: Matchdetails,
    val Teams: Teamss
):Serializable {
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
    ) {
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
      // val x6: @RawValue Any? = null,
        @SerializedName("6")
       val six: X6,

        @SerializedName("7")
       val seven:X7,
    ) : Serializable {
        data class X6(
            val Name_Full: String,
            val Name_Short: String,
            val Players: Playerss
        )   {
            data class Playerss(
                @SerializedName("2734")
                val p1: X2734,

                @SerializedName("3472")
                val p2: X3472,
                @SerializedName("4038")
                val p3: X4038,
                @SerializedName("57492")
                val p4: X57492,
                @SerializedName("59429")
                val p5: X59429,
                @SerializedName("63084")
                val p6: X63084,
                @SerializedName("64073")
                val p7: X64073,
                @SerializedName("64306")
                val p8: X64306,
                @SerializedName("64321")
                val p9: X64321,
                @SerializedName("65739")
                val p10: X65739,
                @SerializedName("66833")
                val p11: X66833
            ) {
                data class X2734(
                    val Batting: Batting1,
                    val Bowling: Bowling1,
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

                data class X3472(
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

                data class X4038(
                    val Batting: Batting3,
                    val Bowling: Bowling3,
                    val Iscaptain: Boolean,
                    val Iskeeper: Boolean,
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

                data class X57492(
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

                data class X59429(
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

                data class X63084(
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

                data class X64073(
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

                data class X64306(
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

                data class X64321(
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

                data class X65739(
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

                data class X66833(
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

        data class X7(
            val Name_Full: String,
            val Name_Short: String,
            val Players: Players_x7
        ){
            data class Players_x7(
                val `12518`: X12518,
                val `24669`: X24669,
                val `28891`: X28891,
                val `3667`: X3667,
                val `4356`: X4356,
                val `48191`: X48191,
                val `5313`: X5313,
                val `57458`: X57458,
                val `59736`: X59736,
                val `63611`: X63611,
                val `64221`: X64221
            ) {
                data class X12518(
                    val Batting: Batting1,
                    val Bowling: Bowling1,
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

                data class X24669(
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

                data class X28891(
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

                data class X3667(
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

                data class X4356(
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

                data class X48191(
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

                data class X5313(
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

                data class X57458(
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

                data class X59736(
                    val Batting: Batting9,
                    val Bowling: Bowling9,
                    val Iskeeper: Boolean,
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

                data class X63611(
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

                data class X64221(
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