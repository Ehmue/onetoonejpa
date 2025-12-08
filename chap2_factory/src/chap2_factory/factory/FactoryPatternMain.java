package chap2_factory.factory;

import chap2_factory.model.Account;
import chap2_factory.model.Bank;

public class FactoryPatternMain {
	
	public static void main(String[] args) {
		
		AccountFactory accountFactory = new AccountFactory();
		
		Account currentAccount = accountFactory.getAccount("Current");
		currentAccount.accountType();
		
		Account savingAccount = accountFactory.getAccount("Saving");
		savingAccount.accountType();
		
		
		BankFactory bankFactory = new BankFactory();
		
		Bank bankName = bankFactory.getBank("YesBank");
		bankName.getBankName();
		
		Bank bankName1 = bankFactory.getBank("icicibank");
		bankName1.getBankName();
	}

}
