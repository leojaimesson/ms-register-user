package com.jaimesson.msregisteruser.adapter.persistence.repositories.jpa

import com.jaimesson.msregisteruser.adapter.persistence.entities.UserConfirmationTypeEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserConfirmationTypeRepositoryJpa : JpaRepository<UserConfirmationTypeEntity, UUID> {
    fun findByTypeName(typeName: String): UserConfirmationTypeEntity?
}
