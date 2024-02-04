package com.jaimesson.msregisteruser.adapter.persistence.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.Date
import java.util.UUID

@Entity
@Table(name = "users")
class UserEntity(
    @Id
    val id: UUID? = UUID.randomUUID(),

    val email: String,

    val password: String,

    val enabled: Boolean? = false,

    @Column(name = "created_at")
        val createdAt: Date? = Date(),

    @Column(name = "updated_at")
        val updatedAt: Date? = Date()
)