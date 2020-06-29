package com.mayorova.demo.service;

import com.mayorova.demo.dto.ReaderDto;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface ReaderService {
    ReaderDto createReader(ReaderDto readerDto);

    void deleteById(Long id);

    ReaderDto getById(Long id);

    List<ReaderDto> getAll();

    ReaderDto updateReader(ReaderDto readerDto);
}
