package com.jaimesson.msregisteruser.domain.usecases

import com.jaimesson.msregisteruser.domain.models.UserConfirmation

interface CreateUserConfirmationUseCase {
    fun execute(userConfirmation: UserConfirmation): UserConfirmation
}