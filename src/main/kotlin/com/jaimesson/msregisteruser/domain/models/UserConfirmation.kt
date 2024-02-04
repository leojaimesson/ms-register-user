package com.jaimesson.msregisteruser.domain.models

import java.util.Date
import java.util.UUID

class UserConfirmation(
    val id: UUID? = UUID.randomUUID(),

    val user: User,

    val userConfirmationType: UserConfirmationType,

    val createdAt: Date? = Date(),

    val updatedAt: Date? = Date(),

    val confirmed: Boolean? = false,

    val confirmationToken: String
) {
}