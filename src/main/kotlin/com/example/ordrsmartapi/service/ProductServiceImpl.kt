package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.repository.IProductRepository
import com.example.ordrsmartapi.utils.exception.ProductException
import com.example.ordrsmartapi.utils.mapper.ProductMapper
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(
        private val productRepository: IProductRepository,
        private val productMapper: ProductMapper
) : IProductService {
    override fun createProduct(productDTO: ProductDTO): ProductDTO {
        if (productDTO.id.toInt() != -1) {
            throw ProductException("Id should not be provided")
        }

        val product = productRepository.save(productMapper.fromDtoToEntity(productDTO))
        return productMapper.fromEntityToDto(product)
    }

//    override fun getProducts(): List<ProductDTO> {
//        val product = productRepository.ge()
//
//        if (product.isEmpty())
//            throw ProductException("List of movies is empty.")
//
//        return product.map {
////            productMapper.fromEntityToDomain(it)
//        }.toSet()
//    }

    override fun getProduct(id: Int): ProductDTO {
        TODO("Not yet implemented")
    }

    override fun updateProduct(movieDTO: ProductDTO): ProductDTO {
        TODO("Not yet implemented")
    }

    override fun deleteProduct(id: Int) {
        TODO("Not yet implemented")
    }

}
