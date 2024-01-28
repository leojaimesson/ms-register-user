package com.jaimesson.msregisteruser.services

import com.jaimesson.msregisteruser.entities.UserConfirmationType
import com.jaimesson.msregisteruser.exceptions.UserConfirmationTypeNotFoundException
import com.jaimesson.msregisteruser.repositories.UserConfirmationTypeRepository
import org.springframework.stereotype.Service

@Service
class UserConfirmationTypeService(
    private val userConfirmationTypeRepository: UserConfirmationTypeRepository
) {
    fun retrieve(typeName: String): UserConfirmationType {
        val type = userConfirmationTypeRepository.findByTypeName(typeName)
        if (type == null) {
            throw UserConfirmationTypeNotFoundException("confirmation type not found!")
        } else {
            return type
        }
    }
}