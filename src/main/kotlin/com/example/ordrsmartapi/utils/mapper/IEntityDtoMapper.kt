package com.example.ordrsmartapi.utils.mapper

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.entity.Product
import org.springframework.stereotype.Service

@Service
interface IEntityDtoMapper {
    fun fromProductEntityToDto(entity: Product): ProductDTO
    fun fromProductDtoToEntity(domain: ProductDTO): Product
}