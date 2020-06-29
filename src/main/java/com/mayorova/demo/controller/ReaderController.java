package com.mayorova.demo.controller;

import com.mayorova.demo.dto.ReaderDto;
import com.mayorova.demo.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/readers")
@RestController
public class ReaderController {
    private final ReaderService readerService;

    @Autowired
    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }

    @GetMapping(value = "/{id}")
    public ReaderDto getReaderByNumberReaderTicket(@PathVariable("id") Long id) {
        return readerService.getById(id);
    }

    @GetMapping
    public List<ReaderDto> getAllReader() {
        return readerService.getAll();
    }

    @PutMapping
    public ReaderDto updateReader(@RequestBody ReaderDto reader) {
        return readerService.updateReader(reader);
    }

    @DeleteMapping(value ="/{id}")
    public void deleteReader(@PathVariable("id") Long id) {
        readerService.deleteById(id);
    }

    @PostMapping
    public ReaderDto createReader(@RequestBody ReaderDto readerDto) {
        return readerService.createReader(readerDto);
    }
}
