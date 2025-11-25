package com.example.demo.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Account;
import com.example.demo.model.Amount;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.TransferRepository;

public class TransferServiceImpl implements TransferService
{

	private AccountRepository accountRepository;
	private TransferRepository transferRepository;
	
	
	
	public TransferServiceImpl(AccountRepository accountRepository, TransferRepository transferRepository) 
	{
		this.accountRepository = accountRepository;
		this.transferRepository = transferRepository;
	}



	@Override
	public void transferMoney(Long fromid, Long toid, Amount amount) throws SQLException 
	{
		//find account fromid
		Account accountA = accountRepository.findById(fromid);
		
		//find account toid
		Account accountB = accountRepository.findById(toid);
		
		//transfer to repository
		transferRepository.transfer(accountA, accountB, amount);
	}


	
}
