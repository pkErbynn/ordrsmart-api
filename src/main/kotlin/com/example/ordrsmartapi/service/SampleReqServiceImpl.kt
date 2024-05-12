package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.*
import com.example.ordrsmartapi.entity.SampleRequest
import com.example.ordrsmartapi.repository.ISampleReqRepository
import com.example.ordrsmartapi.utils.exception.SampleRequestException
import com.example.ordrsmartapi.utils.mapper.EntityDtoMapper
import org.springframework.stereotype.Service


@Service
class SampleReqServiceImpl(
        private val sampleReq: ISampleReqRepository,
        private val mapper: EntityDtoMapper
) : ISampleReqService {

    override fun getSampleRequestById(id: Long): ResponseOfSampleRequestDto {
        val optionalSampleRequest = sampleReq.findById(id)
        val sampleRequest = optionalSampleRequest.orElseThrow { SampleRequestException("SampleRequest with id $id is not present") }
        return mapToResponseDto(sampleRequest)
    }

    private fun mapToResponseDto(sampleRequest: SampleRequest): ResponseOfSampleRequestDto {
        return ResponseOfSampleRequestDto(
                success = true,
                message = "successfully got sample request",
                sampleRequest =  ReadSampleRequestDto(
                        id = sampleRequest.id,
                        product = ProductDTO(
                                id = sampleRequest.product.id,
                                name = sampleRequest.product.name),
                        variant = ReadVariantDto(
                                id = sampleRequest.variant.id,
                                values = VariantInnerDto(
                                        concentration = sampleRequest.variant.concentration,
                                        flavor = sampleRequest.variant.flavor,
                                        weight = sampleRequest.variant.weight)
                        ),
                        sampleQuantity = sampleRequest.sampleQuantity,
                        sampleApplication = sampleRequest.sampleApplication,
                        shippingAddress = mapper.mapAddressToDto(sampleRequest.shippingAddress),
                        additionalInformation = sampleRequest.additionalInformation,
                        createdAt = sampleRequest.createdAt,
                        createdBy = sampleRequest.createdBy
                )
        )
    }
}