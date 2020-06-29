package com.mayorova.demo.converter;

import com.mayorova.demo.dto.DeliveryDto;
import com.mayorova.demo.entity.Book;
import com.mayorova.demo.entity.Delivery;
import com.mayorova.demo.entity.Librarian;
import com.mayorova.demo.entity.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DeliveryDtoToDeliveryConverter implements Converter<DeliveryDto, Delivery> {
    private final ConversionService conversionService;

    @Autowired
    public DeliveryDtoToDeliveryConverter(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public Delivery convert(DeliveryDto deliveryDto) {
        Delivery delivery = new Delivery();
        delivery.setReturnDate(deliveryDto.getReturnDate());
        delivery.setDeliveryDate(deliveryDto.getDeliveryDate());
        delivery.setId(deliveryDto.getIdDelivery());
        delivery.setReader(conversionService.convert(deliveryDto.getReaderDto(), Reader.class));
        delivery.setLibrarian(conversionService.convert(deliveryDto.getLibrarianDto(), Librarian.class));
        delivery.setBook(conversionService.convert(deliveryDto.getBooks(), Book.class));
        return delivery;
    }
}
