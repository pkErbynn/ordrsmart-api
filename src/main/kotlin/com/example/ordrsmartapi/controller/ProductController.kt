package com.example.ordrsmartapi.controller

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.service.interfaces.IProductService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class ProductController (
        private val productService: IProductService)  {
    @PostMapping("/products")
    fun createMovie(@RequestBody productDTO: ProductDTO): ResponseEntity<ProductDTO> {
        return ResponseEntity(productService.createProduct(productDTO), HttpStatus.CREATED)
    }

    @GetMapping("/products/{id}")
    fun getMovie(@PathVariable id: Long): ResponseEntity<ProductDTO> {
        return ResponseEntity.ok(productService.getProduct(id))
    }
}


