package chap2_factory.factory;

import chap2_factory.model.AbstractFactory;
import chap2_factory.model.Account;
import chap2_factory.model.Bank;

public class AbstractFactoryPatternMain 
{
	
	public static void main(String[] args) 
	{
		FactoryProducer factoryProducer = new FactoryProducer();
		
		AbstractFactory bankFactory = factoryProducer.getFactory("BANK");
		Bank bank = bankFactory.getBank("YESBANK");
		bank.getBankName();
		
		AbstractFactory accountFactory = factoryProducer.getFactory("ACCOUNT");
		Account savingAccount  = accountFactory.getAccount("SAVING");
		savingAccount.accountType();
		
	}

}
