package com.driver.channel.entities.dto.request

import com.driver.channel.entities.domain.DriverEntity

class RequestPostDriverEntity(
    val name: String,
    val cellphone: String
) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

     fun toEntity() = DriverEntity(name = name , cellphone = cellphone)


}


