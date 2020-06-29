package com.mayorova.demo.service;

import com.mayorova.demo.dto.ReaderDto;
import com.mayorova.demo.entity.Reader;
import com.mayorova.demo.repository.ReaderRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ReaderServiceImpl implements ReaderService {
    private final ReaderRepository readerRepository;
    private final ConversionService conversionService;

    public ReaderServiceImpl(ReaderRepository readerRepository, ConversionService conversionService) {
        this.readerRepository = readerRepository;
        this.conversionService = conversionService;
    }

    @Override
    public ReaderDto createReader(ReaderDto readerDto) {
        Reader reader = conversionService.convert(readerDto, Reader.class);
        return conversionService.convert(readerRepository.save(reader), ReaderDto.class);
    }

    @Override
    public void deleteById(Long id) {
        Reader reader = readerRepository.findById(id).get();
        readerRepository.delete(reader);
    }

    @Override
    public ReaderDto getById(Long id) {
        Reader reader = readerRepository.findById(id).get();
        return conversionService.convert(reader, ReaderDto.class);
    }

    @Override
    public List<ReaderDto> getAll() {
        List<Reader> readers = readerRepository.findAll();
        return readers.stream().map(reader -> conversionService.convert(reader, ReaderDto.class)).collect(Collectors.toList());
    }

    @Override

    public ReaderDto updateReader(ReaderDto readerDto) {
        Reader reader = readerRepository.findById(readerDto.getId()).get();
        reader.setLastName(readerDto.getLastName());
        reader.setFirstName(readerDto.getFirstName());
        reader.setPhoneNumber(readerDto.getPhoneNumber());
        reader.setId(readerDto.getId());
        return conversionService.convert(readerRepository.save(reader), ReaderDto.class);
    }
}
