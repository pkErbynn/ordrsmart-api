//package com.example.ordrsmartapi.service
//
//import com.example.ordrsmartapi.dto.ProductDTO
//import com.example.ordrsmartapi.entity.Product
//import com.example.ordrsmartapi.repository.IProductRepository
//import com.example.ordrsmartapi.service.ProductServiceImpl
//import com.example.ordrsmartapi.utils.exception.ProductException
//import com.example.ordrsmartapi.utils.mapper.IEntityDtoMapper
//import org.junit.jupiter.api.Assertions.*
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.extension.ExtendWith
//import org.mockito.ArgumentMatchers.any
//import org.mockito.InjectMocks
//import org.mockito.Mock
//import org.mockito.Mockito.`when`
//import org.mockito.junit.jupiter.MockitoExtension
//import java.util.*
//
//@ExtendWith(MockitoExtension::class)
//class ProductServiceImplTest2 {
//
//    @Mock
//    private lateinit var productRepository: IProductRepository
//
//    @Mock
//    private lateinit var mapper: IEntityDtoMapper
//
//    @InjectMocks
//    private lateinit var productService: ProductServiceImpl
//
//    @Test
//    fun `test createProduct throws exception if ID is provided`() {
//        val productDTO = ProductDTO(id = 1L, name = "Test Product")
//        val exception = assertThrows(ProductException::class.java) {
//            productService.createProduct(productDTO)
//        }
//        assertEquals("Product Id should not be provided", exception.message)
//    }
//
//    @Test
//    fun `test createProduct success`() {
//        val productDTO = ProductDTO(id = -1, name = "New Product")
//        val product = Product(id = 0L, name = "New Product")
//
//
//        `when`(mapper.fromProductDtoToEntity(any())).thenReturn(product)
//        `when`(productRepository.save(any())).thenReturn(product)
//        `when`(mapper.fromProductEntityToDto(any())).thenReturn(ProductDTO(id = 1L, name = "New Product"))
//
//        val savedProductDTO = productService.createProduct(productDTO)
//
//        assertNotNull(savedProductDTO)
//        assertEquals("New Product", savedProductDTO.name)
//        assertEquals(1L, savedProductDTO.id)
//    }
//
////    @Test
////    fun `test getProduct found`() {
////        val product = Product(id = 1L, name = "Existing Product")
////        whenever(productRepository.findById(1L)).thenReturn(Optional.of(product))
////        whenever(mapper.fromProductEntityToDto(product)).thenReturn(ProductDTO(id = 1L, name = "Existing Product"))
////
////        val productDTO = productService.getProduct(1L)
////
////        assertNotNull(productDTO)
////        assertEquals(1L, productDTO.id)
////        assertEquals("Existing Product", productDTO.name)
////    }
////
////    @Test
////    fun `test getProduct not found`() {
////        whenever(productRepository.findById(any())).thenReturn(Optional.empty())
////
////        val exception = assertThrows(ProductException::class.java) {
////            productService.getProduct(1L)
////        }
////        assertEquals("Product with id 1 is not present", exception.message)
////    }
//}
