package com.example.ordrsmartapi.utils.mapper

interface IMapper<D, E> {
    fun fromProductEntityToDto(entity: E): D
    fun fromProductDtoToEntity(domain: D): E
}