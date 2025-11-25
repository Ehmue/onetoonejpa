package com.example.demo.repository.jpa;

import com.example.demo.model.Account;
import com.example.demo.model.Amount;
import com.example.demo.repository.TransferRepository;

public class JpaTransferRepository implements TransferRepository
{

	@Override
	public void transfer(Account accountA, Account accountB, Amount amount) 
	{
				
		System.out.println("ransfer from accountA to accountB via Jpa implimentation");
	}
	
	
}
