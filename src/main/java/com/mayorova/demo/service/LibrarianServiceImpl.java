package com.mayorova.demo.service;

import com.mayorova.demo.dto.LibrarianDto;
import com.mayorova.demo.entity.Librarian;
import com.mayorova.demo.repository.LibrarianRepository;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
@Transactional
public class LibrarianServiceImpl implements LibrarianService {
    private final static Logger LOGGER = Logger.getLogger(LibrarianServiceImpl.class.getName());
    private final LibrarianRepository librarianRepository;
    private final ConversionService conversionService;

    public LibrarianServiceImpl(LibrarianRepository librarianRepository, ConversionService conversionService) {
        this.librarianRepository = librarianRepository;
        this.conversionService = conversionService;
    }

    @Override
    public LibrarianDto createLibrarian(LibrarianDto librarianDto) {
        LOGGER.info("Created librarian: " + librarianDto);
        Librarian librarian = conversionService.convert(librarianDto, Librarian.class);
        return conversionService.convert(librarianRepository.save(librarian), LibrarianDto.class);
    }

    @Override
    public void deleteById(Long id) {
        LOGGER.info("Deleted librarian: ");
        Librarian librarian = librarianRepository.findById(id).get();
        librarianRepository.delete(librarian);
    }

    @Override
    public LibrarianDto getById(Long id) {
        LOGGER.info("Get by id librarian: ");
        Librarian librarian = librarianRepository.findById(id).get();
        return conversionService.convert(librarian, LibrarianDto.class);

    }

    @Override
    public LibrarianDto updateLibrarian(LibrarianDto librarianDto) {
        Librarian librarian1 = librarianRepository.findById(librarianDto.getId()).get();
        librarian1.setLastName(librarianDto.getLastName());
        librarian1.setFirstName(librarianDto.getFirstName());
        librarian1.setId(librarianDto.getId());
        librarian1.setDelivery(librarian1.getDelivery());
        return conversionService.convert(librarianRepository.save(librarian1), LibrarianDto.class);
    }

    @Override
    public List<LibrarianDto> getAll() {
        LOGGER.info("Get all librarian ");
        List<Librarian> librarians = librarianRepository.findAll();
        return librarians.stream().map(librarian -> conversionService.convert(librarian, LibrarianDto.class)).collect(Collectors.toList());
    }
}
