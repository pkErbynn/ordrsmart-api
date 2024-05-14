package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.entity.Product
import com.example.ordrsmartapi.repository.IProductRepository
import com.example.ordrsmartapi.utils.exception.ProductException
import com.example.ordrsmartapi.utils.mapper.EntityDtoMapper
import com.example.ordrsmartapi.utils.mapper.IEntityDtoMapper
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.any
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class ProductServiceImplTest {

    @Mock
    private lateinit var productRepository: IProductRepository

    @Mock
    private lateinit var entityDtoMapper: IEntityDtoMapper

    @InjectMocks
    private lateinit var productService: ProductServiceImpl

    @Test
    fun `test createProduct throws exception if ID is provided`() {
        val productDTO = ProductDTO(id = 1L, name = "Test Product")
        assertThrows(ProductException::class.java) {
            productService.createProduct(productDTO)
        }
    }

    @Test
    fun `test createProduct success`() {
        val productDTO = ProductDTO(name = "New Product")
        val product = Product(name = "New Product", id = 1L)
//        `when`(entityDtoMapper.fromProductDtoToEntity(any(ProductDTO::class.java))).thenReturn(product)
        `when`(productRepository.save(any(Product::class.java))).thenReturn(product)
//        `when`(entityDtoMapper.fromProductEntityToDto(any(Product::class.java))).thenReturn(ProductDTO(id = 1L, name = "New Product"))

        val savedProductDTO = productService.createProduct(productDTO)

        assertNotNull(savedProductDTO)
        assertEquals(savedProductDTO.name, "New Product")
        verify(productRepository).save(Product(id  = productDTO.id, name = product.name))
//        verify(entityDtoMapper).fromProductEntityToDto(product)
    }

    @Test
    fun createProduct() {
    }

    @Test
    fun getProduct() {
    }

    @Test
    fun updateProduct() {
    }

    @Test
    fun deleteProduct() {
    }
}