package com.example.sportzinteractiveapp.adapter

import android.app.Dialog
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sportzinteractiveapp.R
import com.example.sportzinteractiveapp.databinding.PlayerLayoutBinding
import com.example.sportzinteractiveapp.databinding.StyleLayoutBinding
import com.example.sportzinteractiveapp.model.newmodel.TeamPlayer
import kotlinx.coroutines.NonDisposableHandle.parent

class TeamAdapter:RecyclerView.Adapter<TeamAdapter.TeamListViewHolder>(){
       var allPlayerList= mutableListOf<TeamPlayer>()
    class TeamListViewHolder(val binding: PlayerLayoutBinding):RecyclerView.ViewHolder(binding.root)

    fun setAdpterlist(playerist: List<TeamPlayer>) {
        this.allPlayerList=playerist.toMutableList()
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TeamAdapter.TeamListViewHolder {
        val inflater=LayoutInflater.from(parent.context)
       val binding=PlayerLayoutBinding.inflate(inflater,parent,false)
       return TeamListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TeamAdapter.TeamListViewHolder, position: Int) {
       val playerList=allPlayerList[position]
        Log.e("TAG","First Playerlist ${playerList}")
        holder.binding.playerName.text=playerList.Name_Full
       // holder.binding.battingStyle.text=playerList.Batting.Style
      //  holder.binding.bowlingStyle.text=playerList.Bowling.Style
        if (playerList.Iscaptain.equals(true)){
            holder.binding.isCaptain.visibility= View.VISIBLE
            holder.binding.isCaptain.text= "Captain"
        }
        else{
            holder.binding.isCaptain.visibility= View.GONE
        }
        if (playerList.Iskeeper.equals(true)){
            holder.binding.isKeeper.visibility= View.VISIBLE
            holder.binding.isKeeper.text= "Keeper"
        }
        else{
            holder.binding.isKeeper.visibility= View.GONE
        }

        holder.binding.root.setOnClickListener {
              val dialog=Dialog(it.context)
            dialog.setContentView(R.layout.style_layout)
            dialog.setCancelable(true)
            val textview=dialog.findViewById<TextView>(R.id.batting_Style)
            val textview1=dialog.findViewById<TextView>(R.id.bowling_style)
            textview.text=playerList.Batting.Style
            textview1.text=playerList.Bowling.Style
            dialog.show()

        }

    }

    override fun getItemCount()=allPlayerList.size
}