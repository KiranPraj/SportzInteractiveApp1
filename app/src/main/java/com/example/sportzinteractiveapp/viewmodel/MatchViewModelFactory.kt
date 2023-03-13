package com.example.sportzinteractiveapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.sportzinteractiveapp.remote.MatchRepository

class MatchViewModelFactory constructor(val repository: MatchRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MatchViewModel::class.java))
        {
            MatchViewModel(this.repository) as T
        }
        else
        {
            throw java.lang.IllegalArgumentException("View model Does not Found")
        }
    }
}