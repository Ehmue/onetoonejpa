package com.example.demo.repository;

import java.sql.SQLException;

import com.example.demo.model.Account;

public interface AccountRepository 
{

	Account findById(long id) throws SQLException;

}
