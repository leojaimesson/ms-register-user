package com.jaimesson.msregisteruser.adapter.persistence.repositories

import com.jaimesson.msregisteruser.adapter.mappers.UserMapper
import com.jaimesson.msregisteruser.adapter.persistence.repositories.jpa.UserRepositoryJpa
import com.jaimesson.msregisteruser.application.repositories.UserRepository
import com.jaimesson.msregisteruser.domain.models.User
import org.springframework.stereotype.Component

@Component
class UserRepositoryImpl(private val userRepositoryJpa: UserRepositoryJpa): UserRepository {
    override fun save(user: User): User {
        val model = UserMapper.mapToEntity(user)
        val result = userRepositoryJpa.save(model)
        return UserMapper.mapToDomain(result)
    }
}