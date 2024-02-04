package com.jaimesson.msregisteruser.adapter.persistence.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "users_confirmation_type")
class UserConfirmationTypeEntity(
    @Id
    val id: UUID? = UUID.randomUUID(),

    @Column(name = "type_name")
    val typeName: String
)