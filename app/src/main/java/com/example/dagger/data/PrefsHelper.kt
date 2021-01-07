package com.example.dagger.data

import android.content.Context
import android.content.SharedPreferences

class PrefsHelper(context: Context) {



    private var prefs : SharedPreferences =
        context.getSharedPreferences("myshared", Context.MODE_PRIVATE)

    fun saveLogin(login: String){
         prefs.edit().putString(LOGIN,login).apply()
    }

    fun getLogin(): String? {
      return  prefs.getString(LOGIN,"") ?:""
    }

    companion object{
        private const val LOGIN = "LOGIN"
    }

}