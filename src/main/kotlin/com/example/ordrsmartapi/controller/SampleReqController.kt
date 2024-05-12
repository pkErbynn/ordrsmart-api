package com.example.ordrsmartapi.controller

import com.example.ordrsmartapi.dto.ResponseOfSampleRequestDto
import com.example.ordrsmartapi.service.ISampleReqService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class SampleReqController (
        private val sampleRequestService: ISampleReqService)  {

    @GetMapping("/sample-requests/{id}")
    fun getSampleRequest(@PathVariable id: Long): ResponseEntity<ResponseOfSampleRequestDto> {
        return ResponseEntity.ok(sampleRequestService.getSampleRequestById(id))
    }
}