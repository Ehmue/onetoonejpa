package com.example.demo.repository.jdbc;

import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Account;
import com.example.demo.model.Amount;
import com.example.demo.repository.AccountRepository;

public class JdbcAccountRepository implements AccountRepository
{
	@Autowired
	private DataSource dataSource;

	@Override
	public Account findById(long id) throws SQLException 
	{

		Account account = null;
		
		try 
		{
			// load driver
			
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			// Class.forName("org.postgresql.Driver");
			// Class.forName("oracle.jdbc.driver.OracleDriver");
//
//
//			System.out.println("Got Connection");
//			
		String sql = "select * from Account where id = ?";
//			
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/springtraining", "root", "ehmue@1998");
//			
			Connection conn = dataSource.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				
				Amount amount = new Amount();
				account = new Account();
				amount.setAmount(rs.getDouble("amount"));
				
				account.setId(rs.getLong("id"));
				account.setName(rs.getString("name"));
				account.setAmount(amount);
				
			}
			
			conn.close();
		
		}

		catch (SQLException ex) 
		{
			ex.printStackTrace();
			System.out.println("Can't create connection !!!");
		}
		
		return account;
	}

	
	

}
