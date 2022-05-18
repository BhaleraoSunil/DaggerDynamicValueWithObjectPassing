package com.example.daggerdynamicvaluewithobjectpassing



import javax.inject.Inject
import javax.inject.Named

/*
* Consumer class which is using annotation qualifiers instead of named annotation.
 */
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,

    @MessageQualifier private val  notificationService: NotificationService
) {


    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password);
        notificationService.send("sunil@gmail.com",email,"Welcome, thanks for registration.")
    }

}