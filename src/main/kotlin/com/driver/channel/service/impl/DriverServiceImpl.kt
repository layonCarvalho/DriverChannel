package com.driver.channel.service.impl

import com.driver.channel.entities.dto.request.RequestDeleteDriverEntity
import com.driver.channel.entities.dto.request.RequestPostDriverEntity
import com.driver.channel.entities.dto.request.RequestPutDriverEntity
import com.driver.channel.entities.dto.response.ResponseGetDriverEntity
import com.driver.channel.entities.exception.DriverDeleteException
import com.driver.channel.entities.exception.DriverException
import com.driver.channel.entities.exception.DriverPostException
import com.driver.channel.entities.exception.DriverPutException
import com.driver.channel.repository.driver.domain.Driver
import com.driver.channel.repository.driver.domain.toDomain
import com.driver.channel.repository.driver.domain.toEntity
import com.driver.channel.repository.driver.repository.DriverRepository
import com.driver.channel.service.driver.DriverService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class DriverServiceImpl(val repository: DriverRepository) : DriverService {

	val LOG = LoggerFactory.getLogger(DriverServiceImpl::class.java)

	override fun get() : ResponseGetDriverEntity {

		LOG.info("START GET Driver")

		var response = emptyList<Driver>()

		runCatching {

			response = repository.findAll()

		}.onFailure {

			LOG.error("ERROR GET Driver message: {} causeMessage: {}", it.message, it.cause!!.message)

			throw DriverException(it, HttpStatus.INTERNAL_SERVER_ERROR, "DRIVER_GET_EXCEPTION", "driver.get.exception")

		}.onSuccess {

			LOG.info("END GET Driver response: {}", response)

		}

		return ResponseGetDriverEntity(response)
	}



	override fun post(body: RequestPostDriverEntity) {

		LOG.info("START POST Driver body: {}", body)

		runCatching {

			val domain = body.toEntity().toDomain()

			repository.save(domain)

		}.onFailure {

			LOG.error("ERROR POST Driver body: {} message: {} causeMessage: {}", body, it.message, it.cause!!.message)

			throw DriverPostException(it, HttpStatus.INTERNAL_SERVER_ERROR, "DRIVER_POST_EXCEPTION", "driver.post.exception")

		}.onSuccess {

			LOG.info("END POST Driver")

		}
	}



	override fun put(body: RequestPutDriverEntity){

		LOG.info("START PUT driver body: {}", body)

		runCatching {

			val domain = body.toDomain()

			repository.save(domain)

		}.onFailure {

			LOG.error("ERROR PUT Driver body: {} message: {} causeMessage: {}", body, it.message, it.cause!!.message)

			throw DriverPutException(it, HttpStatus.INTERNAL_SERVER_ERROR, "DRIVER_PUT_EXCEPTION", "driver.put.exception")

		}.onSuccess {

			LOG.info("END PUT Driver")

		}

	}

	override fun delete(body: RequestDeleteDriverEntity){

		LOG.info("START DELETE Driver body: {}", body)

		runCatching {

			val response = repository.findByNameIn(body.driver.name)

			repository.deleteAll(response)

		}.onFailure {

			LOG.error("ERROR DELETE Driver body: {} message: {} causeMessage: {}", body, it.message, it.cause!!.message)

			throw DriverDeleteException(it, HttpStatus.INTERNAL_SERVER_ERROR, "DRIVER_DELETE_EXCEPTION", "driver.delete.exception")

		}.onSuccess {

			LOG.info("END DELETE Driver")
		}

	}
}


