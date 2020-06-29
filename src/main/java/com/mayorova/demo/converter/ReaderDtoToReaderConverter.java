package com.mayorova.demo.converter;

import com.mayorova.demo.dto.ReaderDto;
import com.mayorova.demo.entity.Address;
import com.mayorova.demo.entity.Delivery;
import com.mayorova.demo.entity.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ReaderDtoToReaderConverter implements Converter<ReaderDto, Reader> {

    private ConversionService conversionService;

    @Autowired
    public ReaderDtoToReaderConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public Reader convert(ReaderDto readerDto) {
        Reader reader = new Reader();
        reader.setFirstName(readerDto.getFirstName());
        reader.setLastName(readerDto.getLastName());
        reader.setPhoneNumber(readerDto.getPhoneNumber());
        reader.setId(readerDto.getId());
        reader.setDelivery(conversionService.convert(readerDto.getDeliveryDto(), Delivery.class));
        reader.setAddress(conversionService.convert(readerDto.getAddress(), Address.class));
        return reader;
    }
}
