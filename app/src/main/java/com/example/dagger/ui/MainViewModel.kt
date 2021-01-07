package com.example.dagger.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.dagger.data.PrefsHelper
import com.example.dagger.di.inject
import kotlinx.coroutines.*

class MainViewModel: ViewModel() {

    private val repository by inject { retrofitRepository }
    private val prefs by inject { prefence }
    private val scope = CoroutineScope(Job())

    fun loadList(){
        scope.launch(Dispatchers.IO) {
            kotlin.runCatching {
               val result = repository.loadBLogs(20,1)
                Log.d("gdfgd","it.localizedMessage")
            }.onFailure {
                Log.d("gdfgd",it.localizedMessage)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        scope.cancel()
    }
}