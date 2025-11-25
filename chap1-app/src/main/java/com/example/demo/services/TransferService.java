package com.example.demo.services;

import java.sql.SQLException;

import com.example.demo.model.Amount;

public interface TransferService 
{
	
	public void transferMoney(Long fromid, Long toid, Amount amount) throws SQLException;
	
}
