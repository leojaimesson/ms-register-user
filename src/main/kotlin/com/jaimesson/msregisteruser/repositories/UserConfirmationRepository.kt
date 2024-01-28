package com.jaimesson.msregisteruser.repositories

import com.jaimesson.msregisteruser.entities.UserConfirmation
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserConfirmationRepository : JpaRepository<UserConfirmation, UUID>
