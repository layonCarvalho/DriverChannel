package com.driver.channel.entities.dto.request

import com.driver.channel.entities.domain.DriverEntity

class RequestPostDriverEntity(
    val name: String,
    val cellphone: String,
    val email: String,
    val active: Boolean
)
 fun RequestPostDriverEntity.toEntity() = DriverEntity(
        name = name,
        cellphone = cellphone,
        email=  email,
        active= active)

