package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.TransferRepository;
import com.example.demo.repository.jdbc.JdbcAccountRepository;
import com.example.demo.repository.jdbc.JdbcTransferRepository;
import com.example.demo.repository.jpa.JpaAccountRepository;
import com.example.demo.repository.jpa.JpaTransferRepository;
import com.example.demo.services.TransferService;
import com.example.demo.services.TransferServiceImpl;

@Configuration
public class AppConfig 
{
	
	@Bean
	public TransferService transferService()
	{
		return new TransferServiceImpl(accountRepository(), transferRepository());
	}
	
	@Bean
	public TransferRepository transferRepository()
	{
		
		return new JdbcTransferRepository();
	}
	
	@Bean
	public AccountRepository accountRepository()
	{
		
		return new JdbcAccountRepository();
	}
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/springtraining");
        dataSource.setUsername("root");
        dataSource.setPassword("ehmue@1998");
        
        return dataSource;
	}
}
