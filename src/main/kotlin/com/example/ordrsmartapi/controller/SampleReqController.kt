package com.example.ordrsmartapi.controller

import com.example.ordrsmartapi.dto.GetSampleRequestDto
import com.example.ordrsmartapi.dto.ResponseOfSampleRequestDto
import com.example.ordrsmartapi.entity.SampleRequest
import com.example.ordrsmartapi.service.ISampleReqService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class SampleReqController (
        private val sampleRequestService: ISampleReqService)  {

    @GetMapping("/sample-requests")
    fun getSampleRequest(@RequestBody sampleRequestGetDto: GetSampleRequestDto): ResponseEntity<ResponseOfSampleRequestDto> {
        return ResponseEntity.ok(sampleRequestService.getSampleRequestById(sampleRequestGetDto.sample_request_id))
    }

//    @PostMapping("/sample-requests")
//    fun createSampleRequest(@RequestBody sampleRequestCreateDto: CreateSampleRequest): ResponseEntity<ResponseOfSampleRequestDto> {
//        return ResponseEntity.ok(sampleRequestService.getSampleRequestById(sampleRequestCreateDto.sample_request_id))
//    }
}