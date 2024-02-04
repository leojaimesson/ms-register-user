package com.jaimesson.msregisteruser.application.repositories

import com.jaimesson.msregisteruser.domain.models.UserConfirmation

interface UserConfirmationRepository {
    fun save(userConfirmation: UserConfirmation): UserConfirmation
}