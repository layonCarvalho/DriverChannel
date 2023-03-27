package com.driver.channel.controller.config

import org.slf4j.LoggerFactory
import org.springframework.context.MessageSource
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class DriverChannelHandler(val messageSource: MessageSource) {

	val LOG = LoggerFactory.getLogger(DriverChannelHandler::class.java)



		//@ResponseStatus(HttpStatus.UNAUTHORIZED)
		//@ExceptionHandler(value = [AuthUnauthorizedException::class])
	//fun handle(e: AuthUnauthorizedException) : ApiError {
	//		LOG.error("ERROR AUTHENTICATE " + e.message)
	//		return ApiError(e.httpStatusCode.value(), e.codeMessage, e.message)
	//	}
}