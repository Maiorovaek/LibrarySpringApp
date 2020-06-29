package com.mayorova.demo.controller;

import com.mayorova.demo.dto.*;
import com.mayorova.demo.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/deliveries")
@RestController
public class DeliveryController {

    private final DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping(value = "/{id}")
    public DeliveryDto getDelivery(@PathVariable Long id) {
        return deliveryService.getById(id);
    }

    @GetMapping
    public List<DeliveryDto> getAllDelivery() {
        return deliveryService.getAll();
    }

    @PutMapping
    public DeliveryDto updateDelivery(@RequestBody DeliveryDto delivery) {
        return deliveryService.updateDelivery(delivery);
    }

    @DeleteMapping
    public void deleteDelivery(@PathParam("id") Long id) {
        deliveryService.deleteById(id);
    }

    @PostMapping
    public DeliveryDto createDelivery(@RequestBody DeliveryDto delivery) {
        return deliveryService.createDelivery(delivery);
    }
}
