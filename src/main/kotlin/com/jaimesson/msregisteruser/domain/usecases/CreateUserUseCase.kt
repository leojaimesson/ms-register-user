package com.jaimesson.msregisteruser.domain.usecases

import com.jaimesson.msregisteruser.domain.models.User

interface CreateUserUseCase {
    fun execute(user: User): User
}
