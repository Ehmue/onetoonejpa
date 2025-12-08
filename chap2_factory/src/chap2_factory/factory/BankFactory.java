package chap2_factory.factory;

import chap2_factory.model.AbstractFactory;
import chap2_factory.model.Account;
import chap2_factory.model.Bank;
import chap2_factory.model.ICICIBank;
import chap2_factory.model.YesBank;

public class BankFactory implements AbstractFactory
{
	
	public Bank getBank(String bankName) 
	{
		
		if(bankName.equals("YESBANK"))
		{
			return new YesBank();
		}
		else if(bankName.equals("ICICIBANK"))
		{
			return new ICICIBank();
		}
		return null;
		
	}

	@Override
	public Account getAccount(String accountType) {
		// TODO Auto-generated method stub
		return null;
	}

}
