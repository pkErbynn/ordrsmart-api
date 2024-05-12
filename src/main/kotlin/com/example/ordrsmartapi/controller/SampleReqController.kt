package com.example.ordrsmartapi.controller

import com.example.ordrsmartapi.dto.GetSampleRequestDto
import com.example.ordrsmartapi.dto.ResponseOfSampleRequestDto
import com.example.ordrsmartapi.service.ISampleReqService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class SampleReqController (
        private val sampleRequestService: ISampleReqService)  {

    @GetMapping("/sample-requests")
    fun getSampleRequest(@RequestBody sampleRequestDto: GetSampleRequestDto): ResponseEntity<ResponseOfSampleRequestDto> {
        return ResponseEntity.ok(sampleRequestService.getSampleRequestById(sampleRequestDto.sample_request_id))
    }
}