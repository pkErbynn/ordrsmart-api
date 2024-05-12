package com.example.ordrsmartapi.controller

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.service.IProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController (
        private val productService: IProductService)  {
    @PostMapping("/")
    fun createMovie(@RequestBody productDTO: ProductDTO): ResponseEntity<ProductDTO> {
        return ResponseEntity(productService.createProduct(productDTO), HttpStatus.CREATED)
    }
}