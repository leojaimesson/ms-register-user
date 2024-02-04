package com.jaimesson.msregisteruser.adapter.mappers

import com.jaimesson.msregisteruser.adapter.persistence.entities.UserConfirmationEntity
import com.jaimesson.msregisteruser.domain.models.UserConfirmation

class UserConfirmationMapper {
    companion object {
        fun mapToDomain(userConfirmationModel: UserConfirmationEntity): UserConfirmation {
            return UserConfirmation(
                id = userConfirmationModel.id,
                confirmed = userConfirmationModel.confirmed,
                confirmationToken = userConfirmationModel.confirmationToken,
                user = UserMapper.mapToDomain(userConfirmationModel.user),
                createdAt = userConfirmationModel.createdAt,
                updatedAt = userConfirmationModel.updatedAt,
                userConfirmationType = UserConfirmationTypeMapper.mapToDomain(userConfirmationModel.userConfirmationType)
            )
        }

        fun mapToEntity(userConfirmation: UserConfirmation): UserConfirmationEntity {
            return UserConfirmationEntity(
                id = userConfirmation.id,
                confirmed = userConfirmation.confirmed,
                confirmationToken = userConfirmation.confirmationToken,
                user = UserMapper.mapToEntity(userConfirmation.user),
                createdAt = userConfirmation.createdAt,
                updatedAt = userConfirmation.updatedAt,
                userConfirmationType = UserConfirmationTypeMapper.mapToEntity(userConfirmation.userConfirmationType)
            )
        }
    }
}