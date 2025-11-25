package com.example.demo.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Account;
import com.example.demo.model.Amount;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.TransferRepository;

public class TransferServiceImpl implements TransferService
{

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private TransferRepository transferRepository;
	
	@Override
	public void transferMoney(long fromid, long toid, Amount amount) throws SQLException 
	{
		//find account fromid
		Account accountA = accountRepository.findById(fromid);
		
		//find account toid
		Account accountB = accountRepository.findById1(toid);
		
		//transfer to repository
		transferRepository.transfer(accountA, accountB);
	}
	
}
