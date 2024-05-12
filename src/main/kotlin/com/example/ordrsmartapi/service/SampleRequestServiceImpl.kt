//package com.example.ordrsmartapi.service
//
//import com.example.ordrsmartapi.entity.SampleRequest
//import com.example.ordrsmartapi.repository.ISampleRequestRepository
//import org.springframework.transaction.annotation.Transactional
//import org.springframework.stereotype.Service
//
//@Service
//class SampleRequestServiceImpl (private val sampleRequestRepository: ISampleRequestRepository) {
//    @Transactional
//    fun createSampleRequest(sampleRequest: SampleRequest): SampleRequest {
//        return sampleRequestRepository.save(sampleRequest)
//    }
//
//    @Transactional(readOnly = true)
//    fun getSampleRequestById(id: Long): SampleRequest? {
//        return sampleRequestRepository.findById(id).orElse(null)
//    }
//}