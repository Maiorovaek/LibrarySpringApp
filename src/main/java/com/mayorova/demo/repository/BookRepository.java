package com.mayorova.demo.repository;

import com.mayorova.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
//@Transactional
public interface BookRepository extends JpaRepository<Book, Long> {
}
