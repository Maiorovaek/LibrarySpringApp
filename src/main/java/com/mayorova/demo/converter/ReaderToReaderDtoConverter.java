package com.mayorova.demo.converter;

import com.mayorova.demo.dto.AddressDto;
import com.mayorova.demo.dto.DeliveryDto;
import com.mayorova.demo.dto.ReaderDto;
import com.mayorova.demo.entity.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ReaderToReaderDtoConverter implements Converter<Reader, ReaderDto> {

    private ConversionService conversionService;

    @Autowired
    public ReaderToReaderDtoConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    @Override
    public ReaderDto convert(Reader reader) {
        ReaderDto readerDto = new ReaderDto();
        readerDto.setFirstName(reader.getFirstName());
        readerDto.setLastName(reader.getLastName());
        readerDto.setId(reader.getId());
        readerDto.setPhoneNumber(reader.getPhoneNumber());
        readerDto.setDeliveryDto(conversionService.convert(reader.getDelivery(), DeliveryDto.class));
        readerDto.setAddress(conversionService.convert(reader.getAddress(), AddressDto.class));
        return readerDto;
    }
}
