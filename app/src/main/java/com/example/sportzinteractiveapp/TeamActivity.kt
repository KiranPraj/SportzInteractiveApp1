package com.example.sportzinteractiveapp

import android.app.Activity
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.example.sportzinteractiveapp.databinding.ActivityTeamBinding
import com.example.sportzinteractiveapp.model.MatchData
import com.example.sportzinteractiveapp.model.newmodel.MatchResponse
import com.example.sportzinteractiveapp.model.newmodel.TeamPlayer
import com.google.gson.Gson
import java.io.Serializable
import kotlin.math.log

class TeamActivity : AppCompatActivity() {
    lateinit var binding: ActivityTeamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)
/*
        fun <T : Serializable?> getSerializable(activity: Activity, name: String, clazz: Class<T>): T
        {
            return if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
                activity.intent.getSerializableExtra(name, clazz)!!
            else
                activity.intent.getSerializableExtra(name) as T
        }*/
      //  val myPOJOClass = getSerializable(this, "TEAMDATA", MatchData.Teamss::class.java)
        val dataclass=Gson().fromJson(intent?.extras?.getString("TEAMDATA1"),MatchResponse::class.java)
       Log.e("TAG","DATA CLASS DATA "+dataclass)
         var arrayList= arrayListOf<String>()
        val linearLayout=LinearLayout(this)
        val textView=TextView(this)
        textView.textSize= 20F
        linearLayout.addView(textView)

    }



    }
