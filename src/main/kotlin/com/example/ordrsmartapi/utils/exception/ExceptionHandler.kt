package com.example.ordrsmartapi.utils.exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandler {
    @ExceptionHandler(Exception::class)
    fun generalExceptionHandler(exception: Exception): ResponseEntity<ApiError>{
        val error = ApiError(exception.message)
        return ResponseEntity(error, error.status)
    }

    @ExceptionHandler(ProductException::class)
    fun productExceptionHandler(exception: Exception): ResponseEntity<ApiError>{
        val error = ApiError(exception.message)
        return ResponseEntity(error, error.status)
    }
}