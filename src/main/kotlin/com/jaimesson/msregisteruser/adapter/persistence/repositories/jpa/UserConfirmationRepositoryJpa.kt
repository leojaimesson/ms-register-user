package com.jaimesson.msregisteruser.adapter.persistence.repositories.jpa

import com.jaimesson.msregisteruser.adapter.persistence.entities.UserConfirmationEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserConfirmationRepositoryJpa : JpaRepository<UserConfirmationEntity, UUID>
