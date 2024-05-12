package com.example.ordrsmartapi.dto

data class CreateSampleRequestDTO (
        var product_id: Long,
        var variant_id: Long,
        var sample_quantity: String,
        var sample_application: String,
        var shipping_address: ShippingAddress,
        var additional_information: String,
        var requestor: String
)

data class ShippingAddress (
        var line_1: Long,
        var line_2: Long?,
        var city: String,
        var state: String,
        var zip_code: String,
)


