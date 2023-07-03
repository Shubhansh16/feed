package com.example.chahatbhai.Message

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MessageViewModel: ViewModel() {

    private val _text=MutableLiveData<String>().apply {
        value="This is Message Fragment"
    }
    val text : LiveData<String> = _text
}