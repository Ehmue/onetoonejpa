package com.example.demo.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

public class JdbcAccountRepository implements AccountRepository
{
	private Connection conn = null;
	private ResultSet rs = null;
	private Statement stmt = null;
	private String url;
	private String username;
	private String password;
	private PreparedStatement prestm;
	private String sql;

	@Override
	public Account findById(long fromid) 
	{
		url = "jdbc:mysql://localhost:3306/springtraining";
		username = "root";
		password = "ehmue@1998";
		
		
		return null;
	}

}
