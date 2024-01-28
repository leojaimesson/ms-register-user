package com.jaimesson.msregisteruser.services

import com.jaimesson.msregisteruser.entities.UserConfirmationType
import com.jaimesson.msregisteruser.entities.User
import com.jaimesson.msregisteruser.entities.UserConfirmation
import com.jaimesson.msregisteruser.repositories.UserConfirmationRepository
import org.springframework.stereotype.Service

@Service
class UserConfirmationService(
    private val userConfirmationRepository: UserConfirmationRepository
) {
    fun create(user: User, userConfirmationType: UserConfirmationType): UserConfirmation {
        val userConfirmation = UserConfirmation(user = user, userConfirmationType = userConfirmationType, confirmationToken = "VAZIO POR ENQUANTO")
        return userConfirmationRepository.save(userConfirmation);
    }
}
