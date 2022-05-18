package com.example.daggerdynamicvaluewithobjectpassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

/*
Dagger demo with dyanamic value passing to component via creating object and passing to component

*/
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent
            .builder()
            .notificationServiceModule(NotificationServiceModule(3))
            .build()
        component.inject(this)

        userRegistrationService.registerUser("sunil@yopmail.com","1234")
    }
}