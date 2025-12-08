package chap2_factory.factory;
import chap2_factory.model.AbstractFactory;
import chap2_factory.model.Account;
import chap2_factory.model.Bank;

public class FactoryProducer 
{
	public AbstractFactory getFactory(String factroy) 
	{
		if (factroy.equals("BANK")) 
		{
			return new BankFactory();
		}
		else if (factroy.equals("ACCOUNT")) 
		{
			return new AccountFactory();
			
		}
		
		return null;
		
		
	}
	

}
