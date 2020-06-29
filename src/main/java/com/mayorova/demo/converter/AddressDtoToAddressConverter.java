package com.mayorova.demo.converter;

import com.mayorova.demo.dto.AddressDto;
import com.mayorova.demo.entity.Address;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AddressDtoToAddressConverter implements Converter<AddressDto, Address> {
    @Override
    public Address convert(AddressDto addressDto) {
        Address address = new Address();
        address.setCity(addressDto.getCity());
        address.setNumberFlat(addressDto.getNumberFlat());
        address.setNumberHouse(addressDto.getNumberHouse());
        address.setStreet(addressDto.getStreet());
        address.setId(addressDto.getId());
        return address;
    }
}
