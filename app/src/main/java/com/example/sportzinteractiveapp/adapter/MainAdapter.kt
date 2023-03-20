package com.example.sportzinteractiveapp.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sportzinteractiveapp.TeamActivity
import com.example.sportzinteractiveapp.databinding.TeamLayoutBinding
import com.example.sportzinteractiveapp.model.newmodel.MatchResponse
import com.google.gson.Gson


class MainAdapter:RecyclerView.Adapter<MainAdapter.TeamViewHolder>() {

        var teamList= mutableListOf<MatchResponse>()
   // var empty_list= mutableListOf<>()


    class TeamViewHolder(val binding:TeamLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
       val inflater=LayoutInflater.from(parent.context)
        val binding=TeamLayoutBinding.inflate(inflater,parent,false)
        return TeamViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return teamList.size
    }

   /* fun setDetails(teams:Response<MatchData>,team2:Response<SecondMatchData>){
        teamList.add(teams)
        teamList.add(team2)
        notifyDataSetChanged()
    }*/
    fun setDetails(team:List<MatchResponse>){
       Log.e("TAG","Complete LIst "+team)
        this.teamList=team.toMutableList()
       notifyDataSetChanged()
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val team=teamList[position]
       // Log.e("TAG","team   "+team.Teams.size)
        holder.binding.date.text=team.Matchdetail.Match.Date
        holder.binding.time.text=team.Matchdetail.Match.Time
        holder.binding.venue.text=team.Matchdetail.Venue.Name

        holder.binding.team1.text= team.Teams.get(team.Matchdetail.Team_Away)?.Name_Full
        holder.binding.team2.text= team.Teams.get(team.Matchdetail.Team_Home)?.Name_Full
         val teamdata1=team.Teams.get(team.Matchdetail.Team_Home)?.Players?.values
         val teamdata2=team.Teams.get(team.Matchdetail.Team_Away)?.Players?.values
         holder.binding.button.setOnClickListener {
           // val data= MatchData.Teamss(MatchData.Teamss.X6.Playerss,MatchData.Teamss.X7)
           // val data=MatchData.Teamss()
         val intent =Intent(it.context, TeamActivity::class.java)
              intent.putExtra("TEAMDATA1", Gson().toJson(team) )
             // intent.putExtra("TEAMDATA2", Gson().toJson(teamdata2) )
              Log.d("TAG","intent data $intent")
              it.context.startActivity(intent)
         Toast.makeText(it.context,"Player Team1 ${team.Teams.get(team.Matchdetail.Team_Home)?.Players?.values}  " +"Player Team2 ${team.Teams.get(team.Matchdetail.Team_Home)?.Players?.values}",Toast.LENGTH_LONG).show()
        }


        }




}