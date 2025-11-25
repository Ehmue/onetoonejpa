package com.example.demo.repository.jpa;

import java.sql.SQLException;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

public class JpaAccountRepository implements AccountRepository
{

	@Override
	public Account findById(long id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
