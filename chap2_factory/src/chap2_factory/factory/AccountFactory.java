package chap2_factory.factory;
import chap2_factory.model.*;

public class AccountFactory implements AbstractFactory

{
	public Account getAccount(String accountType)
	{
		if (accountType.equals("SAVING")) 
		{
			return new SavingAccount();
		}
		else if(accountType.equals("CURRENT"))
		{
			return new CurrentAccount();
		}
		return null;
	}

	@Override
	public Bank getBank(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}


}
