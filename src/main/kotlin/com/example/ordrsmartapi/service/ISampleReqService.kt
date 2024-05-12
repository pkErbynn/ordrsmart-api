package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.ResponseOfSampleRequestDto
import com.example.ordrsmartapi.entity.SampleRequest

interface ISampleReqService {
    fun getSampleRequestById(id: Long): ResponseOfSampleRequestDto
}