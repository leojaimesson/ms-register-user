package com.jaimesson.msregisteruser.adapter.mappers

import com.jaimesson.msregisteruser.adapter.persistence.entities.UserConfirmationTypeEntity
import com.jaimesson.msregisteruser.domain.models.UserConfirmationType

class UserConfirmationTypeMapper {

    companion object {
        fun mapToDomain(userConfirmationTypeModel: UserConfirmationTypeEntity): UserConfirmationType {
            return UserConfirmationType(id=userConfirmationTypeModel.id, typeName = userConfirmationTypeModel.typeName)
        }

        fun mapToEntity(userConfirmationType: UserConfirmationType): UserConfirmationTypeEntity {
            return UserConfirmationTypeEntity(id = userConfirmationType.id, typeName = userConfirmationType.typeName)
        }
    }
}