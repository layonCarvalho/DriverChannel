package com.driver.channel.controller.driver

import com.driver.channel.entities.dto.request.RequestDeleteDriverEntity
import com.driver.channel.entities.dto.request.RequestPostDriverEntity
import com.driver.channel.entities.dto.request.RequestPutDriverEntity
import com.driver.channel.service.driver.DriverService
import io.swagger.annotations.ApiOperation
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@ApiOperation(tags = ["Driver CRUD"], value = "Layer responsible to recevie request to manager Create/Read/Update/Delete the Driver entity")
class DriverController(val service: DriverService) {

	@GetMapping("driver/v1")
	@ApiOperation("Find all driver´s ", response = HttpStatus::class)
	fun get() = ResponseEntity.ok(service.get())


	@PostMapping("driver/v1")
	@ApiOperation("Save new driver", response = HttpStatus::class)
	fun post(@RequestBody body: RequestPostDriverEntity): ResponseEntity<HttpStatus> {

		service.post(body)

		return ResponseEntity.ok(HttpStatus.OK)

	}

	@PutMapping("driver/v1")
	@ApiOperation("Update data driver", response = HttpStatus::class)
	fun put(@RequestBody body: RequestPutDriverEntity): ResponseEntity<HttpStatus> {

		service.put(body)

		return ResponseEntity.ok(HttpStatus.OK)
	}

	@PutMapping("driver/v1")
	@ApiOperation("Block driver by Document", response = HttpStatus::class)
	fun block(@RequestBody body: RequestPutDriverEntity): ResponseEntity<HttpStatus> {
		return ResponseEntity.ok(HttpStatus.OK)
	}

	@DeleteMapping("driver/v1")
	@ApiOperation("Exclude driver by name", response = HttpStatus::class)
	fun delete(@RequestBody body: RequestDeleteDriverEntity): ResponseEntity<HttpStatus> {

		service.delete(body)

		return ResponseEntity.ok(HttpStatus.OK)
	}
}
