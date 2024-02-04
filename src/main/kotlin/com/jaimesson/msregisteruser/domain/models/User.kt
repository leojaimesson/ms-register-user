package com.jaimesson.msregisteruser.domain.models

import java.util.Date
import java.util.UUID

class User(
    val id: UUID? = UUID.randomUUID(),

    val email: String,

    private var password: String,

    val enabled: Boolean? = false,

    val createdAt: Date? = Date(),

    val updatedAt: Date? = Date()
) {
    fun getPassword(): String {
        return this.password
    }

    fun setPassword(value: String) {
        this.password = value
    }
}