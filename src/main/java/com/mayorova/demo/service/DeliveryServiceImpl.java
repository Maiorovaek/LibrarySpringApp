package com.mayorova.demo.service;

import com.mayorova.demo.dto.DeliveryDto;
import com.mayorova.demo.entity.Book;
import com.mayorova.demo.entity.Delivery;
import com.mayorova.demo.entity.Librarian;
import com.mayorova.demo.entity.Reader;
import com.mayorova.demo.repository.DeliveryRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliveryServiceImpl implements DeliveryService {
    private final DeliveryRepository deliveryRepository;
    private final ConversionService conversionService;


    public DeliveryServiceImpl(DeliveryRepository deliveryRepository, ConversionService conversionService) {
        this.deliveryRepository = deliveryRepository;
        this.conversionService = conversionService;
    }

    @Override
    public DeliveryDto createDelivery(DeliveryDto deliveryDto) {
        Delivery delivery = conversionService.convert(deliveryDto, Delivery.class);
        return conversionService.convert(deliveryRepository.save(delivery), DeliveryDto.class);
    }

    @Override
    public void deleteById(Long id) {
        Delivery delivery = deliveryRepository.findById(id).get();
        deliveryRepository.delete(delivery);

    }

    @Override
    public DeliveryDto getById(Long id) {
        Delivery delivery = deliveryRepository.findById(id).get();
        return conversionService.convert(delivery, DeliveryDto.class);
    }

    @Override
    public List<DeliveryDto> getAll() {
        List<Delivery> deliveries = deliveryRepository.findAll();
        return deliveries.stream().map(delivery -> conversionService.convert(delivery, DeliveryDto.class)).collect(Collectors.toList());
    }

    @Override
    public DeliveryDto updateDelivery(DeliveryDto deliveryDto) {
        Delivery delivery = deliveryRepository.findById(deliveryDto.getIdDelivery()).get();
        delivery.setDeliveryDate(deliveryDto.getDeliveryDate());
        delivery.setReturnDate(deliveryDto.getReturnDate());
        delivery.setId(deliveryDto.getIdDelivery());
        delivery.setReader(conversionService.convert(deliveryDto.getReaderDto(), Reader.class));
        delivery.setBook(conversionService.convert(deliveryDto.getBooks(), Book.class));
        delivery.setLibrarian(conversionService.convert(deliveryDto.getLibrarianDto(), Librarian.class));
        return conversionService.convert(deliveryRepository.save(delivery), DeliveryDto.class);
    }
}
