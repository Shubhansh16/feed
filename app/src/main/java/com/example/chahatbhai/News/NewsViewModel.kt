package com.example.chahatbhai.News

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsViewModel:ViewModel() {
    init {
        Log.i("NewsViewModel","NewsViewModel Created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("NewsViewModel","NewsViewModel destroyed")
    }
}