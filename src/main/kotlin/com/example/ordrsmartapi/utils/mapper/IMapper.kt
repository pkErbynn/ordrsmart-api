package com.example.ordrsmartapi.utils.mapper

interface IMapper<D, E> {
    fun fromEntityToDto(entity: E): D
    fun fromDtoToEntity(domain: D): E
}