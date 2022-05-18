package com.example.daggerdynamicvaluewithobjectpassing


import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule(private val retryCount:Int) {


    //example of  annotation qualifier.
    // To avoid typo mistakes, we will use annotation qualifier

   // @Named("message")
    @MessageQualifier
    @Provides
    fun getMessageService():NotificationService{
        return MessageService(retryCount)
    }

    //@Named("email")
    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}