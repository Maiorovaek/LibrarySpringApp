package com.mayorova.demo.service;

import com.mayorova.demo.dto.AddressDto;
import com.mayorova.demo.entity.Address;
import com.mayorova.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    private final ConversionService conversionService;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, ConversionService conversionService) {
        this.addressRepository = addressRepository;
        this.conversionService = conversionService;
    }

    @Override
    public AddressDto createAddress(AddressDto addressDto) {
        Address address = conversionService.convert(addressDto, Address.class);
        return conversionService.convert(addressRepository.save(address), AddressDto.class);
    }

}
