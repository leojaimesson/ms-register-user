package com.jaimesson.msregisteruser.services

import com.jaimesson.msregisteruser.dtos.UserRegisterDTO
import com.jaimesson.msregisteruser.entities.User
import com.jaimesson.msregisteruser.repositories.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository, private val passwordEncoder: PasswordEncoder
) {
    fun create(userRegisterDto: UserRegisterDTO): User {
        val user = User(email = userRegisterDto.email, password = passwordEncoder.encode(userRegisterDto.password))
        return userRepository.save(user);
    }
}
