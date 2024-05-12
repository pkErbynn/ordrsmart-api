package com.example.ordrsmartapi.dto
import java.time.LocalDateTime

data class GetSampleRequestDto (
        var sample_request_id: Long,
)

data class ReadSampleRequestDto(
        val id: Long,
        val product: ProductDTO,
//        val variant: ProductVariantDTO,
        val sampleQuantity: String,
        val sampleApplication: String,
        val shippingAddress: ReadAddressDTO,
        val additionalInformation: String?,
        val createdAt: LocalDateTime,
        val createdBy: String
)

data class ResponseOfSampleRequestDto(
        val success: Boolean,
        val message: String,
        val sampleRequest: ReadSampleRequestDto,
)
