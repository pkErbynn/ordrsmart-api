package com.example.ordrsmartapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello(): String = "Hello, Spring Boot with Kotlin..."
}
