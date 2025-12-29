package builder;

public class Account 
{
	private String accountName;
	private Long accountNumber;
	private String accountHolder;
	private double balance;
	private String type;
	private double interest;
	
	//constructor
	private Account(AccountBuilder accountBuilder)
	{
		this.accountName = accountBuilder.accountName;
		this.accountNumber = accountBuilder.accountNumber;
		this.accountHolder = accountBuilder.accountHolder;
		this.balance = accountBuilder.balance;
		this.type = accountBuilder.type;
		this.interest = accountBuilder.interest;
	}
	
	//getter & setter
	public String getAccountName() 
	{
		return accountName;
	}


	public void setAccountName(String accountName) 
	{
		this.accountName = accountName;
	}


	public Long getAccountNumber() 
	{
		return accountNumber;
	}


	public void setAccountNumber(Long accountNumber) 
	{
		this.accountNumber = accountNumber;
	}


	public String getAccountHolder() 
	{
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) 
	{
		this.accountHolder = accountHolder;
	}


	public double getBalance() 
	{
		return balance;
	}


	public void setBalance(double balance) 
	{
		this.balance = balance;
	}


	public String getType() 
	{
		return type;
	}


	public void setType(String type) 
	{
		this.type = type;
	}


	public double getInterest() 
	{
		return interest;
	}


	public void setInterest(double interest) 
	{
		this.interest = interest;
	}
	
	

	@Override
	public String toString() 
	{
		return "Account [accountName=" + accountName + ", accountNumber=" + accountNumber + ", accountHolder="
				+ accountHolder + ", balance=" + balance + ", type=" + type + ", interest=" + interest + "]";
	}



	//inner class
	public static class AccountBuilder
	{
		
		private final String accountName;
		private final Long accountNumber;
		private final String accountHolder;
		private double balance;
		private double interest;
		private String type;
		
		//constructor
		public AccountBuilder(String accountName, Long accountNumber, String accountHolder) 
		{
			this.accountName = accountName;
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
		}
		
		//balance
		public AccountBuilder balance(double balance)
		{
			this.balance = balance;
			return this;
		}
		
		//type
		public AccountBuilder type(String type)
		{
			this.type = type;
			return this;
		}
		
		//interest
		public AccountBuilder interest(double interest)
		{
			this.interest = interest;
			return this;
		}
		
		//build
		public Account build()
		{
			Account user = new Account(this);
			return user;
		}
		
	}

}
