package com.jaimesson.msregisteruser.adapter.persistence.repositories

import com.jaimesson.msregisteruser.adapter.mappers.UserConfirmationMapper
import com.jaimesson.msregisteruser.adapter.persistence.repositories.jpa.UserConfirmationRepositoryJpa
import com.jaimesson.msregisteruser.application.repositories.UserConfirmationRepository
import com.jaimesson.msregisteruser.domain.models.UserConfirmation
import org.springframework.stereotype.Component

@Component
class UserConfirmationRepositoryImpl(private val userConfirmationRepositoryJpa: UserConfirmationRepositoryJpa): UserConfirmationRepository {
    override fun save(userConfirmation: UserConfirmation): UserConfirmation {
        val model = UserConfirmationMapper.mapToEntity(userConfirmation)
        val result = userConfirmationRepositoryJpa.save(model)
        return UserConfirmationMapper.mapToDomain(result)
    }
}