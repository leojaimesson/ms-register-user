package com.jaimesson.msregisteruser.adapter.persistence.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "users_confirmation")
class UserConfirmationEntity(
    @Id
    val id: UUID? = UUID.randomUUID(),

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    val user: UserEntity,

    @ManyToOne
    @JoinColumn(name = "confirmation_type_id", nullable = false)
    val userConfirmationType: UserConfirmationTypeEntity,

    @Column(name = "created_at")
    val createdAt: Date? = Date(),

    @Column(name = "updated_at")
    val updatedAt: Date? = Date(),

    val confirmed: Boolean? = false,

    @Column(name = "confirmation_token")
    val confirmationToken: String
) {
}