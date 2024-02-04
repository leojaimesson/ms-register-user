package com.jaimesson.msregisteruser.adapter.persistence.repositories

import com.jaimesson.msregisteruser.adapter.mappers.UserConfirmationTypeMapper
import com.jaimesson.msregisteruser.adapter.persistence.repositories.jpa.UserConfirmationTypeRepositoryJpa
import com.jaimesson.msregisteruser.application.repositories.UserConfirmationTypeRepository
import com.jaimesson.msregisteruser.domain.models.UserConfirmationType
import org.springframework.stereotype.Component

@Component
class UserConfirmationTypeRepositoryImpl(private val userConfirmationTypeRepositoryJpa: UserConfirmationTypeRepositoryJpa) : UserConfirmationTypeRepository {
    override fun findByTypeName(typeName: String): UserConfirmationType? {
        val result = userConfirmationTypeRepositoryJpa.findByTypeName(typeName);
        if (result != null) {
            return  UserConfirmationTypeMapper.mapToDomain(result)
        }
        return null
    }
}
