package com.example.daggerdynamicvaluewithobjectpassing

import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun inject(activity: MainActivity)
}