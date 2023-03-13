package com.example.sportzinteractiveapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportzinteractiveapp.model.newmodel.MatchResponse

import com.example.sportzinteractiveapp.remote.MatchRepository
import kotlinx.coroutines.*

class MatchViewModel constructor(private val repository: MatchRepository) : ViewModel() {
    // val teamlist= mutableListOf<Any>()
    //  val secondTeamList=MutableLiveData<SecondMatchData>()
    val matchList = MutableLiveData<List<MatchResponse>>()

    var errormsg = MutableLiveData<String>()
    var loading = MutableLiveData<Boolean>()
    //  var newTeamList=MutableLiveData<TeamOne>()

    var handleJob: Job? = null


    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError(
            "Exception: ${throwable.localizedMessage}"
        )
    }

    private fun onError(s: String) {
        errormsg.value = s
        loading.value = false
    }

    override fun onCleared() {
        super.onCleared()
        handleJob?.cancel()
    }

    fun getMatchDetails() {
        handleJob = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {

            val response = async { repository.getAllMatchDetails() }

            val response2 = async { repository.getSecondMatchDetails() }

          withContext(Dispatchers.Main){
              try {
                  if (response.await().isSuccessful && response2.await().isSuccessful) {
                      response.await().body()?.let {
                          response2.await().body()?.let { it1 ->
                              var list = ArrayList<MatchResponse>()
                              list.add(it)
                              list.add(it1)
                            //  Log.d("TAG", "result value " + it)
                              Log.d("TAG", "result value " + list)
                              matchList.postValue(list)

                          }
                      }
                  } else {
                      print("mess")
                  }
              } catch (exception: Exception) {
                  print(exception.message)

              }
          }

        }
    }}







