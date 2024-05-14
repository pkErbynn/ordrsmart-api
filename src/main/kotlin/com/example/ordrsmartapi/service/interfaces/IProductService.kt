package com.example.ordrsmartapi.service.interfaces

import com.example.ordrsmartapi.dto.ProductDTO

interface IProductService {
    fun createProduct(productDTO: ProductDTO): ProductDTO

    fun getProduct(id: Long): ProductDTO

    fun updateProduct(movieDTO: ProductDTO): ProductDTO

    fun deleteProduct(id: Int)
}

