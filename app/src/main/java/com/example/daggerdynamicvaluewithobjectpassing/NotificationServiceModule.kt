package com.example.daggerdynamicvaluewithobjectpassing


import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule(private val retryCount:Int) {



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