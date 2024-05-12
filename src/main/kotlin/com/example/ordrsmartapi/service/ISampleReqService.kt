package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.ResponseOfSampleRequestDto

interface ISampleReqService {
    fun getSampleRequestById(id: Long): ResponseOfSampleRequestDto
}