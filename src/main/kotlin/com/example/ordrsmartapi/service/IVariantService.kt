package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.dto.VariantReadDTO

interface IVariantService {
    fun getVariant(id: Long): VariantReadDTO
}