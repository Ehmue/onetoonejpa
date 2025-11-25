package com.example.demo.repository;

import java.sql.SQLException;

import com.example.demo.model.Account;

public interface AccountRepository 
{

	Account findById(long fromid) throws SQLException;
	Account findById1(long toid) throws SQLException;

}
