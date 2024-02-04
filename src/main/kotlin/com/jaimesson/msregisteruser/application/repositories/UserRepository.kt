package com.jaimesson.msregisteruser.application.repositories

import com.jaimesson.msregisteruser.domain.models.User

interface UserRepository {
    fun save(user: User): User
}