package com.example.sportzinteractiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.sportzinteractiveapp.adapter.TeamAdapter
import com.example.sportzinteractiveapp.databinding.ActivityMainBinding
import com.example.sportzinteractiveapp.remote.MatchRepository
import com.example.sportzinteractiveapp.remote.RetroInstane
import com.example.sportzinteractiveapp.remote.RetrofitService
import com.example.sportzinteractiveapp.viewmodel.MatchViewModel
import com.example.sportzinteractiveapp.viewmodel.MatchViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MatchViewModel
    private val adapter=TeamAdapter()
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val retrofitInstance=RetroInstane.getInstance().create(RetrofitService::class.java)
        val repository=MatchRepository(retrofitInstance)
        viewModel=ViewModelProvider(this,MatchViewModelFactory(repository)).get(MatchViewModel::class.java)

        binding.recyclerView.adapter=adapter
        viewModel.matchList.observe(this){

            adapter.setDetails((it))

        }
        viewModel.errormsg.observe(this){

        }
       /* viewModel.loading.observe(this){
           if (it){
               binding.progresbar.visibility=View.VISIBLE
           }
            else {
               binding.progresbar.visibility = View.GONE
           }
        }*/
       /* viewModel.getMatchDetails{
            first,second->
           Log.d("First Result" ,first.body().toString())
           Log.d("Second Result" ,second.body().toString())
           adapter.setDetails(first,second)
        }
*/
        viewModel.getMatchDetails()

    }
}