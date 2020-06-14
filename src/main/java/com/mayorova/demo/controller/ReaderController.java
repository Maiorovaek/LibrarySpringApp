package com.mayorova.demo.controller;

import com.mayorova.demo.dto.AddressDto;
import com.mayorova.demo.dto.ReaderDto;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/readers")
@RestController
public class ReaderController {

    private static List<ReaderDto> readerDtoList = Arrays.asList(
            new ReaderDto(25, "Yulia", "Serova", "89965855687", new AddressDto(1,"N.Novgorod","",1,2)),
            new ReaderDto(35, "Denis", "Komov", "89065473154", new AddressDto(2,"","",5,7)),
            new ReaderDto(85, "Sveta", "Manina", "89085463525", new AddressDto(3,"","",12,127)),
            new ReaderDto(2, "John", "Berezin", "89061605235", new AddressDto(4,"N.Novgorod", "Belinskogo st", 23,5)));

    public ReaderController() {
    }

    @GetMapping(value = "/{id}")
    public ReaderDto getReaderByNumberReaderTicket(@PathVariable int id) {
        return readerDtoList.get(id);
    }

    @GetMapping
    public List<ReaderDto> getAllReader() {
        return readerDtoList;
    }

    @PutMapping
    public ReaderDto updateReader(@RequestBody ReaderDto reader) {
        return null;
    }

    @DeleteMapping
    public void deleteReader(@PathParam("id") long id) {
    }

    @PostMapping
    public ReaderDto createReader(@RequestBody ReaderDto reader) {
        return null;
    }
}
