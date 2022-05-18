package com.example.daggerdynamicvaluewithobjectpassing
import android.annotation.SuppressLint
import android.util.Log
import com.example.daggerdynamicvaluewithobjectpassing.Utils.Companion.TAG
import javax.inject.Inject

interface NotificationService{
    fun send(from:String, to:String, emailBody:String)
}
class EmailService @Inject constructor():NotificationService{

    @SuppressLint("LongLogTag")
    override fun send(from:String, to:String, emailBody:String){
        Log.e(TAG,"Email sent")
    }
}

class MessageService(private val retryCount: Int) :NotificationService{

    @SuppressLint("LongLogTag")
    override fun send(from:String, to:String, emailBody:String){
        Log.e(TAG,"Message sent  retryCount=$retryCount")
    }
}