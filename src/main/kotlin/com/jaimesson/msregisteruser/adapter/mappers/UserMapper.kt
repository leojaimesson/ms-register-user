package com.jaimesson.msregisteruser.adapter.mappers

import com.jaimesson.msregisteruser.adapter.persistence.entities.UserEntity
import com.jaimesson.msregisteruser.domain.models.User


class UserMapper {
    companion object {
        fun mapToDomain(userModel: UserEntity): User {
            return User(
                id = userModel.id,
                email = userModel.email,
                password = userModel.password,
                createdAt = userModel.createdAt,
                updatedAt = userModel.updatedAt,
                enabled = userModel.enabled
            )
        }

        fun mapToEntity(user: User): UserEntity {
            return UserEntity(
                id = user.id,
                email = user.email,
                password = user.getPassword(),
                createdAt = user.createdAt,
                updatedAt = user.updatedAt,
                enabled = user.enabled
            )
        }
    }
}