package com.example.ordrsmartapi.repository

import com.example.ordrsmartapi.entity.SampleRequest
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ISampleReqRepository : CrudRepository<SampleRequest, Long> {
}