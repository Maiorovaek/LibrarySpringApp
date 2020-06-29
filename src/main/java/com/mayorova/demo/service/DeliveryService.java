package com.mayorova.demo.service;

import com.mayorova.demo.dto.DeliveryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeliveryService {
    DeliveryDto createDelivery(DeliveryDto deliveryDto);

    void deleteById(Long id);

    DeliveryDto getById(Long id);

    List<DeliveryDto> getAll();

    DeliveryDto updateDelivery(DeliveryDto deliveryDto);
}
