package com.example.dagger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger.R
import com.example.dagger.utils.viewModel

class MainActivity : AppCompatActivity() {

  //  private val vm by lazy { ViewModelProviders.of(this)[MainViewModel::class.java] }
   private val vm by viewModel(MainViewModel::class)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.loadList()
    }
}