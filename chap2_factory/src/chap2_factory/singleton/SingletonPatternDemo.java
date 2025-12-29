package chap2_factory.singleton;

import java.sql.SQLException;

public class SingletonPatternDemo 
{
	public static void main(String[] args) throws SQLException 
	{
		Dao dao = Dao.getDao();
		System.out.println(dao);
		
		Dao dao2 = Dao.getDao();
		System.out.println(dao2);
		
	}

}
