package com.example.sportzinteractiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sportzinteractiveapp.adapter.TeamAdapter
import com.example.sportzinteractiveapp.adapter.TeamAdapter2
import com.example.sportzinteractiveapp.databinding.ActivityTeamBinding
import com.example.sportzinteractiveapp.model.newmodel.MatchResponse
import com.example.sportzinteractiveapp.model.newmodel.MatchTeam
import com.example.sportzinteractiveapp.model.newmodel.TeamPlayer
import com.google.gson.Gson

class TeamActivity : AppCompatActivity() {
    lateinit var binding: ActivityTeamBinding
    private var matchTeamList:List<MatchTeam>?=null
    private var playerist:List<TeamPlayer>?=null
    private var playerist2:List<TeamPlayer>?=null
    private val adapter=TeamAdapter()
    private val adapter2=TeamAdapter2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)
      binding.recyclerView1.adapter=adapter
      binding.recyclerView2.adapter=adapter2


  val dataclass=Gson().fromJson(intent?.extras?.getString("TEAMDATA1"),MatchResponse::class.java)
       Log.e("TAG","DATA CLASS DATA "+dataclass)
        matchTeamList=dataclass.Teams.map {
            it.value
        }
        Log.e("TAG","playerList ${matchTeamList}")
        binding.tm1.text= matchTeamList!!.get(0).Name_Full
        binding.tm2.text=matchTeamList!!.get(1).Name_Full
        playerist=matchTeamList!!.get(0).Players.map {
            it.value
        }
        playerist2=matchTeamList!!.get(1).Players.map {
            it.value
        }
        adapter.setAdpterlist(playerist!! )
        adapter2.setAdapterLIst(playerist2!!)

    }




    }
