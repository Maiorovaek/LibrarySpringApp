package com.mayorova.demo;

import com.mayorova.demo.dto.DeliveryDto;
import com.mayorova.demo.dto.ReaderDto;
import com.mayorova.demo.entity.Reader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
