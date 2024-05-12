package com.example.ordrsmartapi.utils.mapper

import com.example.ordrsmartapi.dto.*
import com.example.ordrsmartapi.entity.Address
import com.example.ordrsmartapi.entity.Product
import org.springframework.stereotype.Service

@Service
class EntityDtoMapper: IMapper<ProductDTO, Product> {
    override fun fromProductDtoToEntity(domain: ProductDTO): Product = Product (
        domain.id,
        domain.name
    )

    override fun fromProductEntityToDto(entity: Product): ProductDTO = ProductDTO (
        entity.id,
        entity.name,
    )

//    fun mapVariantToDto(variant: ProductVariant): ProductVariantDTO = ProductVariantDTO(
//            id = variant.id,
//            values = ReadProductVariantAttributesDTO(variant.attributes.keys.toString(), variant.attributes.values.toString())
//    )
    fun mapAddressToDto(address: Address): ReadAddressDTO = ReadAddressDTO(
            line1 = address.line1,
            line2 = address.line2,
            city = address.city,
            state = address.state,
            zipCode = address.zipCode
    )




}