package com.example.daggerdynamicvaluewithobjectpassing

import android.annotation.SuppressLint
import android.util.Log
import com.example.daggerdynamicvaluewithobjectpassing.Utils.Companion.TAG
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String,password:String)
}
class SQLRepository @Inject constructor() :UserRepository{

    @SuppressLint("LongLogTag")
    override fun saveUser(email:String, password:String){
        Log.e(TAG,"USer saved in db")
    }
}

class FirebaseRepository  :UserRepository{

    @SuppressLint("LongLogTag")
    override fun saveUser(email:String, password:String){
        Log.e(TAG,"USer saved in firebase")
    }
}