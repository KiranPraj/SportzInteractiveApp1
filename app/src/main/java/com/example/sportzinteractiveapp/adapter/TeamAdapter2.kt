package com.example.sportzinteractiveapp.adapter

import android.app.Dialog
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportzinteractiveapp.R
import com.example.sportzinteractiveapp.databinding.PlayerLayoutBinding
import com.example.sportzinteractiveapp.model.newmodel.TeamPlayer

class TeamAdapter2:RecyclerView.Adapter<TeamAdapter2.TeamListHolder>() {
    var allPlayerList= mutableListOf<TeamPlayer>()
    class TeamListHolder(val binding: PlayerLayoutBinding):RecyclerView.ViewHolder(binding.root)


    fun setAdapterLIst(playerList:List<TeamPlayer>){
        this.allPlayerList=playerList.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamAdapter2.TeamListHolder {
       val inflater=LayoutInflater.from(parent.context)
        val binding=PlayerLayoutBinding.inflate(inflater,parent,false)
       return TeamListHolder(binding)
    }

    override fun onBindViewHolder(holder: TeamAdapter2.TeamListHolder, position: Int) {
        val playerList=allPlayerList[position]
        Log.e("TAG","Second Playerlist ${playerList}")
        holder.binding.playerName.text=playerList.Name_Full
       // holder.binding.battingStyle.text=playerList.Batting.Style
       // holder.binding.bowlingStyle.text=playerList.Bowling.Style
        Log.e("TAG","IS Caption value ${playerList.Iscaptain.toString()}")
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
            val dialog= Dialog(it.context)
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