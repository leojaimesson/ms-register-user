package com.jaimesson.msregisteruser.repositories

import com.jaimesson.msregisteruser.entities.UserConfirmationType
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserConfirmationTypeRepository : JpaRepository<UserConfirmationType, UUID> {
    fun findByTypeName(typeName: String): UserConfirmationType?
}
