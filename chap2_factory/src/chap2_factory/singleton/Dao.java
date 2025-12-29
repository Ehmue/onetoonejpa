package chap2_factory.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao 
{
	private Connection conn;
	private String url;
	private String username;
	private String password;
	private static Dao dao;
	
	private Dao() throws SQLException
	{
		url = "jdbc:mysql://localhost:3306/springtraining";
		username = "root";
		password = "ehmue@1998";
		
		
	}
	
	public static Dao getDao() throws SQLException 
	{
		if (dao == null) 
		{
			dao = new Dao();
		}
		return dao;
		
	}

}
