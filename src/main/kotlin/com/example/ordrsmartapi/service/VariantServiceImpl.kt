package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.VariantReadDTO
import com.example.ordrsmartapi.repository.IVariantRepository
import org.springframework.stereotype.Service

@Service
class VariantServiceImpl (
        private val variantRepository: IVariantRepository,
) : IVariantService  {
    override fun getVariant(id: Long): VariantReadDTO {
        TODO("Not yet implemented")
    }
}