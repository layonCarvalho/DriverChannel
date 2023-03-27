package com.driver.channel.service.driver

import com.driver.channel.entities.driver.dto.request.RequestDeleteDriverEntity
import com.driver.channel.entities.driver.dto.request.RequestPostDriverEntity
import com.driver.channel.entities.driver.dto.request.RequestPutDriverEntity
import com.driver.channel.entities.driver.dto.response.ResponseGetDriverEntity


interface DriverService {

    fun get(): ResponseGetDriverEntity

    fun post(body: RequestPostDriverEntity)

    fun put(body: RequestPutDriverEntity)

    fun delete(body: RequestDeleteDriverEntity)
}