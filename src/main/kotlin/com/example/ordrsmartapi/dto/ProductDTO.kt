package com.example.ordrsmartapi.dto


data class ProductDTO(
        var id: Long = -1,
        var name: String,
)

data class ReadProductDTO(
        val id: Long,
        val name: String
)

data class ReadProductVariantAttributesDTO(
        val concentration: String,
        val flavor: String,
        val weight: String
)

/*
Simplicity and Serialization: Sometimes, for serialization purposes (such as JSON serialization), using a simple, flat structure with explicit fields can be easier to handle and more straightforward for both serialization libraries and client applications to consume.
Database Mapping: If the data model is directly mapped to a database schema using a tool like Hibernate, it may be beneficial or necessary to explicitly declare each field rather than using a map. This can make the mapping to database columns more explicit and manageable,
especially when dealing with schema migrations or SQL queries.
 */
data class ProductVariantDTO(
        val id: Long,
        val values: ReadProductVariantAttributesDTO
)


