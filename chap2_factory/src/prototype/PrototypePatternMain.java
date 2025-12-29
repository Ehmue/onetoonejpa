package prototype;

import prototype.model.Account;

public class PrototypePatternMain 
{
	public static void main(String[] args) 
	{
		
		Account currentAccount = (Account) AccountCache.accountCacheMap.get("CURRENT").clone();
		currentAccount.getType();
		
		Account savingAccount = (Account) AccountCache.accountCacheMap.get("SAVING").clone();
		savingAccount.getType();
	}

}
