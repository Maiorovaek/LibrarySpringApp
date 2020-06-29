package com.mayorova.demo.repository;

import com.mayorova.demo.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
