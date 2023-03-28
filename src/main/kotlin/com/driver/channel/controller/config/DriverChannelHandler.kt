package com.driver.channel.controller.config

import org.slf4j.LoggerFactory
import org.springframework.context.MessageSource
import org.springframework.web.bind.annotation.RestControllerAdvice


@RestControllerAdvice
class DriverChannelHandler(val messageSource: MessageSource) {

	val LOG = LoggerFactory.getLogger(DriverChannelHandler::class.java)




}