package com.example.demo.services;

import com.example.demo.model.Amount;

public interface TransferService 
{
	
	public void transferMoney(long fromid, long toid, Amount amount);
	
}
