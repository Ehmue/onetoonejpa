package com.example.demo.repository;

import com.example.demo.model.Account;
import com.example.demo.model.Amount;

public interface TransferRepository 
{
	void transfer(Account accountA, Account accountB, Amount amount);

}
