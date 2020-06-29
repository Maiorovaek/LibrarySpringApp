package com.mayorova.demo.service;

import com.mayorova.demo.dto.AddressDto;
import org.springframework.stereotype.Service;

//@Service
public interface AddressService {
    AddressDto createAddress(AddressDto addressDto);
}
