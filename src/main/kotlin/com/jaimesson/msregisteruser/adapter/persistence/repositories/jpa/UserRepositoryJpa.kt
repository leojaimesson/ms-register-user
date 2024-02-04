package com.jaimesson.msregisteruser.adapter.persistence.repositories.jpa

import com.jaimesson.msregisteruser.adapter.persistence.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepositoryJpa : JpaRepository<UserEntity, UUID>
