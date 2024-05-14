//package com.example.ordrsmartapi.service
//
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
//import org.springframework.test.context.ActiveProfiles
//
////@DataJpaTest
////@ActiveProfiles("test")
////class ProductRepositoryTests(
////        @Autowired val entityManager: TestEntityManager,
////        @Autowired private val productRepository: ProductRepositoryImpl) {
////
//////    @Test
//////    fun `test create and retrieve product`() {
//////        val product = Product(name = "New Product")
//////        val prod = productRepository.createProduct(product)
//////        val foundProduct = productRepository.getProductById(prod.id);
//////        assert(foundProduct?.name == "New Product")
//////    }
//////
//////    @Test
//////    fun `test findByName finds product`() {
//////        val product = Product(name = "Test Product")
//////        entityManager.persist(product)
//////        entityManager.flush()
//////
//////        val foundProducts = productRepository.getProductById(product.id)
//////        assert(foundProducts.contains(product))
//////    }
//}