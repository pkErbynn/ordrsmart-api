package com.example.ordrsmartapi.utils.mapper

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.entity.Product
import org.springframework.stereotype.Service

@Service
class ProductMapper: IMapper<ProductDTO, Product> {
    override fun fromDtoToEntity(domain: ProductDTO): Product = Product (
        domain.id,
        domain.name
    )

    override fun fromEntityToDto(entity: Product): ProductDTO = ProductDTO (
        entity.id,
        entity.name,
    )







}