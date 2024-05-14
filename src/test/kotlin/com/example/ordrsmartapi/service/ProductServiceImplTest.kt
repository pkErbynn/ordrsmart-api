package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.entity.Product
import com.example.ordrsmartapi.repository.IProductRepository
import com.example.ordrsmartapi.utils.exception.ProductException
import com.example.ordrsmartapi.utils.mapper.IEntityDtoMapper
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.any
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.junit.jupiter.MockitoSettings
import org.mockito.quality.Strictness


@ExtendWith(MockitoExtension::class)
@MockitoSettings(strictness = Strictness.LENIENT)
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

        `when`(entityDtoMapper.fromProductDtoToEntity(MockitoHelper.anyObject<ProductDTO>())).thenReturn(product)
        `when`(productRepository.save(any(Product::class.java))).thenReturn(product)
        `when`(entityDtoMapper.fromProductEntityToDto(MockitoHelper.anyObject<Product>())).thenReturn(ProductDTO(id = 1L, name = "New Product"))
//
//        val savedProductDTO = productService.createProduct(productDTO)
//
//        assertNotNull(savedProductDTO)
//        assertEquals(savedProductDTO.name, "New Product")
////        verify(productRepository).save(Product(id  = productDTO.id, name = product.name))
////        verify(entityDtoMapper).fromProductEntityToDto(product)

//        expect(inOrder).toBeInstanceOf<InOrder>()

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


object MockitoHelper {
    fun <T> anyObject(): T {
        Mockito.any<T>()
        return uninitialized()
    }
    @Suppress("UNCHECKED_CAST")
    fun <T> uninitialized(): T =  null as T
}