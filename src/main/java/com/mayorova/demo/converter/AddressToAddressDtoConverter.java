package com.mayorova.demo.converter;

import com.mayorova.demo.dto.AddressDto;
import com.mayorova.demo.entity.Address;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AddressToAddressDtoConverter implements Converter<Address, AddressDto> {
    @Override
    public AddressDto convert(Address address) {
        AddressDto addressDto = new AddressDto();
        addressDto.setCity(address.getCity());
        addressDto.setNumberFlat(address.getNumberFlat());
        addressDto.setNumberHouse(address.getNumberHouse());
        addressDto.setStreet(address.getStreet());
        addressDto.setId(address.getId());
        return addressDto;
    }
}
