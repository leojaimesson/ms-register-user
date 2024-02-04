package com.jaimesson.msregisteruser.application.usecases

import com.jaimesson.msregisteruser.application.exceptions.UserConfirmationTypeNotFoundException
import com.jaimesson.msregisteruser.application.repositories.UserConfirmationTypeRepository
import com.jaimesson.msregisteruser.domain.models.UserConfirmationType
import com.jaimesson.msregisteruser.domain.usecases.GetUserConfirmationTypeUseCase
import org.springframework.stereotype.Service

@Service
class GetUserConfirmationTypeUseCaseImpl(private val userConfirmationTypeRepository: UserConfirmationTypeRepository): GetUserConfirmationTypeUseCase {
    override fun execute(typeName: String): UserConfirmationType {
        val result = userConfirmationTypeRepository.findByTypeName(typeName)
        if (result == null) {
            throw UserConfirmationTypeNotFoundException("confirmation type not found!")
        } else {
            return result
        }
    }
}