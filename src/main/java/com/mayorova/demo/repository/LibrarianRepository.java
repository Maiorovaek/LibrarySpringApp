package com.mayorova.demo.repository;

import com.mayorova.demo.entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
}

