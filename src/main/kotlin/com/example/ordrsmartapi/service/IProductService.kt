package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.AddressDTO
import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.dto.VariantReadDTO

interface IProductService {
    fun createProduct(productDTO: ProductDTO): ProductDTO

    fun getProduct(id: Long): ProductDTO

    fun updateProduct(movieDTO: ProductDTO): ProductDTO

    fun deleteProduct(id: Int)
}

