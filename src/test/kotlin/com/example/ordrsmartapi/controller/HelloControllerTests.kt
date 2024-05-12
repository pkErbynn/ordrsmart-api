package com.example.ordrsmartapi.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(HelloController::class)
class HelloControllerTests {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `should return default message`() {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk)
                .andExpect(content().string("Hello, Spring Boot with Kotlin..."))
    }
}