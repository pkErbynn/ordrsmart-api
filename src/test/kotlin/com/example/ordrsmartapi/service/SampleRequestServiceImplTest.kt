package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.ProductDTO
import com.example.ordrsmartapi.repository.IProductRepository
import com.example.ordrsmartapi.repository.ISampleRequestRepository
import com.example.ordrsmartapi.utils.exception.ProductException
import com.example.ordrsmartapi.utils.mapper.EntityDtoMapper
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension


@ExtendWith(MockitoExtension::class)
class SampleRequestServiceImplTest {

//    private ISampleRequestRepository pokemonRepository;
//
//    @Mock
//    private val pokemonRepository: ISampleRequestRepository

//    @InjectMocks
//    private val pokemonService: PokemonServiceImpl? = null

    @Mock
    private lateinit var productRepository: IProductRepository

    @Mock
    private lateinit var entityDtoMapper: EntityDtoMapper

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
    fun getSampleRequestById() {
    }

    @Test
    fun createSampleRequestById() {
    }

    @Test
    fun `should get Sample Request By Id`() {
    }
}