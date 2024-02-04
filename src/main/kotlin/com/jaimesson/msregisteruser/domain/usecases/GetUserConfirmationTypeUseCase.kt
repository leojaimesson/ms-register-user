package com.jaimesson.msregisteruser.domain.usecases

import com.jaimesson.msregisteruser.domain.models.UserConfirmationType

interface GetUserConfirmationTypeUseCase {
    fun execute(typeName: String): UserConfirmationType
}