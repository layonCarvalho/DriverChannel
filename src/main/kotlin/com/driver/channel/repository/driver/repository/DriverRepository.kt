package com.driver.channel.repository.driver.repository

import com.driver.channel.repository.driver.domain.Driver
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface DriverRepository : JpaRepository<Driver, Long> {

    fun findByNameIn(name: List<String>) : List<Driver>
}

