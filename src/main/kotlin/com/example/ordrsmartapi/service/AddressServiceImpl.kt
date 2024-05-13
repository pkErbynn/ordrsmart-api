package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.AddressCreateDTO
import com.example.ordrsmartapi.dto.AddressDTO
import com.example.ordrsmartapi.utils.exception.AddressException
import com.example.ordrsmartapi.repository.IAddressRepository
import com.example.ordrsmartapi.utils.mapper.EntityDtoMapper
import org.springframework.stereotype.Service

@Service
class AddressServiceImpl(
        private val addressRepository: IAddressRepository,
        private val entityDtoMapper: EntityDtoMapper
) : IAddressService {
    override fun createAddress(addressDTO: AddressCreateDTO): AddressDTO {
        val address = addressRepository.save(entityDtoMapper.mapAddressCreateDtotoEntity(addressDTO))
        return entityDtoMapper.mapAddressEntityToDto(address)
    }

    override fun getAddress(id: Long): AddressDTO {
        val optionalAddress = addressRepository.findById(id)
        val address = optionalAddress.orElseThrow { AddressException("Address with id $id is not present") }
        return entityDtoMapper.mapAddressEntityToDto(address)
    }

}

