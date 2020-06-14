package com.mayorova.demo.controller;

import com.mayorova.demo.dto.AddressDto;
import com.mayorova.demo.dto.BookDto;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/addresses")
@RestController
public class AddressController {
    public AddressController() {
    }


private List<AddressDto> addressList = Arrays.asList(new AddressDto(1,"N.Novgorod", "Delovaya st.", 105, 8));
    @GetMapping(value = "/{id}")
    public AddressDto getAddress(@PathVariable int id) {
        return addressList.get(id);
    }

    @GetMapping
    public List<AddressDto> getAllAddresses() {
        return addressList;
    }

    @PutMapping
    public AddressDto updateAddress(@RequestBody AddressDto address) {

        return null;
    }

    @DeleteMapping
    public void deleteAddress(@PathParam("id") Long id) {
    }

    @PostMapping
    public AddressDto createAddress(AddressDto address) {
        return null;
    }
}
