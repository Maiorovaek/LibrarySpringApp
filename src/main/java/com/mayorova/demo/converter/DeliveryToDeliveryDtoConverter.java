package com.mayorova.demo.converter;

import com.mayorova.demo.dto.BookDto;
import com.mayorova.demo.dto.DeliveryDto;
import com.mayorova.demo.dto.LibrarianDto;
import com.mayorova.demo.dto.ReaderDto;
import com.mayorova.demo.entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DeliveryToDeliveryDtoConverter implements Converter<Delivery, DeliveryDto> {
    private final ConversionService conversionService;

    @Autowired
    public DeliveryToDeliveryDtoConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public DeliveryDto convert(Delivery delivery) {
        DeliveryDto deliveryDto = new DeliveryDto();
        deliveryDto.setDeliveryDate(delivery.getDeliveryDate());
        deliveryDto.setReturnDate(delivery.getReturnDate());
        deliveryDto.setIdDelivery(delivery.getId());
        deliveryDto.setReaderDto(conversionService.convert(delivery.getReader(), ReaderDto.class));
        deliveryDto.setLibrarianDto(conversionService.convert(delivery.getLibrarian(), LibrarianDto.class));
        deliveryDto.setBooks(conversionService.convert(delivery.getBook(), BookDto.class));
        return deliveryDto;
    }
}
