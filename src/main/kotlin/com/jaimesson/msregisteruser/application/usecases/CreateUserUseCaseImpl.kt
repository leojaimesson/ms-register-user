package com.jaimesson.msregisteruser.application.usecases

import com.jaimesson.msregisteruser.application.repositories.UserRepository
import com.jaimesson.msregisteruser.domain.models.User
import com.jaimesson.msregisteruser.domain.usecases.CreateUserUseCase
import org.springframework.stereotype.Service

@Service
class CreateUserUseCaseImpl(private val userRepository: UserRepository): CreateUserUseCase {
    override fun execute(user: User): User {
        return userRepository.save(user)
    }
}