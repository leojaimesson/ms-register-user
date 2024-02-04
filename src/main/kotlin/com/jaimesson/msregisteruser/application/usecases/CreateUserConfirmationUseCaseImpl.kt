package com.jaimesson.msregisteruser.application.usecases

import com.jaimesson.msregisteruser.application.repositories.UserConfirmationRepository
import com.jaimesson.msregisteruser.domain.models.UserConfirmation
import com.jaimesson.msregisteruser.domain.usecases.CreateUserConfirmationUseCase
import org.springframework.stereotype.Service

@Service
class CreateUserConfirmationUseCaseImpl(private val userConfirmationRepository: UserConfirmationRepository): CreateUserConfirmationUseCase {
    override fun execute(userConfirmation: UserConfirmation): UserConfirmation {
        return userConfirmationRepository.save(userConfirmation)
    }
}