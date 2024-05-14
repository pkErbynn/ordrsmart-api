package com.example.ordrsmartapi.service

import com.example.ordrsmartapi.dto.AddressCreateDTO
import com.example.ordrsmartapi.dto.AddressDTO
import com.example.ordrsmartapi.entity.Address
import com.example.ordrsmartapi.utils.exception.AddressException
import com.example.ordrsmartapi.repository.IAddressRepository
import com.example.ordrsmartapi.service.interfaces.IAddressService
import org.springframework.stereotype.Service

@Service
class AddressServiceImpl(
        private val addressRepository: IAddressRepository,
) : IAddressService {
    override fun createAddress(addressDTO: AddressCreateDTO): AddressDTO {
        val address = addressRepository.save(mapAddressCreateDtotoEntity(addressDTO))
        return mapAddressEntityToDto(address)
    }

    override fun getAddress(id: Long): AddressDTO {
        val optionalAddress = addressRepository.findById(id)
        val address = optionalAddress.orElseThrow { AddressException("Address with id $id is not present") }
        return mapAddressEntityToDto(address)
    }

    private fun mapAddressEntityToDto(address: Address): AddressDTO = AddressDTO(
            line1 = address.line1,
            line2 = address.line2,
            city = address.city,
            state = address.state,
            zipCode = address.zipCode
    )
    private fun mapAddressCreateDtotoEntity(address: AddressCreateDTO): Address = Address(
            line1 = address.line_1,
            line2 = address.line_2,
            city = address.city,
            state = address.state,
            zipCode = address.zip_code,
            id = -1
    )

}

