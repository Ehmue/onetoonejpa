package com.example.demo.repository.jdbc;

import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.demo.model.Account;
import com.example.demo.model.Amount;
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
	
	public JdbcAccountRepository() 
	{
		
		url = "jdbc:mysql://localhost:3306/springtraining";
		username = "root";
		password = "ehmue@1998";
	}
	
	public Connection openConnection() 
	{
		try 
		{
			// load driver
			
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Class.forName("org.postgresql.Driver");
			// Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, username, password);

			System.out.println("Got Connection");
		}

		catch (ClassNotFoundException e) 
		{
			System.out.println("Driver not found ! ! ! ");
		}

		catch (SQLException ex) 
		{
			ex.printStackTrace();
			System.out.println("Can't create connection !!!");
		}

		// create connection
		return conn;
	}
	
	public void closeConnection() 
	{
		if (conn != null) 
		{
			try {
				conn.close();
				System.out.println("Close Connection !!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				conn = null;
			}

		}
	
	}
	

	@Override
	public Account findById(long fromid) throws SQLException 
	{
		
		Account account = null;
		sql = "select * from Account where id='"+ fromid + "'";
		
		if(conn == null)
			conn = openConnection();
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			
			Amount amount = new Amount();
			account = new Account();
			amount.setAmount(rs.getDouble("amount"));
			
			account.setId(rs.getLong("id"));
			account.setName(rs.getString("name"));
			account.setAmount(amount);
			
		}
		
		closeConnection();
		
		return account;
	}
	
	@Override
	public Account findById1(long toid) throws SQLException 
	{
		
		Account account = null;
		sql = "select * from Account where id='"+ toid + "'";
		
		if(conn == null)
			conn = openConnection();
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			
			Amount amount = new Amount();
			account = new Account();
			amount.setAmount(rs.getDouble("amount"));
			
			account.setId(rs.getLong("id"));
			account.setName(rs.getString("name"));
			account.setAmount(amount);
			
		}
		
		closeConnection();
		
		return account;
	}
	
	

}
