package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.repository.IProductRepository
import com.example.ordrsmartapi.utils.exception.ProductException
import com.example.ordrsmartapi.utils.mapper.EntityDtoMapper
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(
        private val productRepository: IProductRepository,
        private val entityDtoMapper: EntityDtoMapper
) : IProductService {
    override fun createProduct(productDTO: ProductDTO): ProductDTO {
        if (productDTO.id.toInt() != -1) {
            throw ProductException("Product Id should not be provided")
        }

        val product = productRepository.save(entityDtoMapper.fromProductDtoToEntity(productDTO))
        return entityDtoMapper.fromProductEntityToDto(product)
    }

    override fun getProduct(id: Long): ProductDTO {
        val optionalProduct = productRepository.findById(id)
        val product = optionalProduct.orElseThrow { ProductException("Product with id $id is not present") }
        return entityDtoMapper.fromProductEntityToDto(product)
    }

    override fun updateProduct(movieDTO: ProductDTO): ProductDTO {
        TODO("Not yet implemented")
    }

    override fun deleteProduct(id: Int) {
        TODO("Not yet implemented")
    }
}



