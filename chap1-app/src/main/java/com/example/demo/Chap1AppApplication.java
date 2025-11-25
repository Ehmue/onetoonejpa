package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.AppConfig;
import com.example.demo.model.Amount;
import com.example.demo.services.TransferService;

@SpringBootApplication
public class Chap1AppApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(Chap1AppApplication.class, args);
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TransferService transferService = context.getBean(TransferService.class);
		transferService.transferMoney(1l, 2l, new Amount(3000));
		
	}

}
