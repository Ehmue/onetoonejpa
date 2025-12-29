package prototype;

import java.util.HashMap;
import java.util.Map;

import prototype.model.Account;
import prototype.model.CurrentAccount;
import prototype.model.SavingAccount;


public class AccountCache 
{
	public static Map<String, Account> accountCacheMap = new HashMap<>();
	
	static
	{
		Account savingAccount = new SavingAccount();
		Account currentAccount = new CurrentAccount();
		accountCacheMap.put("CURRENT", currentAccount);
		accountCacheMap.put("SAVING", savingAccount);
		
	}
	

}
 