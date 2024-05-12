package com.example.ordrsmartapi.dto

import jakarta.persistence.*

data class AddressDTO(
        val id: Long = 0,
        val line1: String,
        val line2: String?,
        val city: String,
        val state: String,
        val zipCode: String
)