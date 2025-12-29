package builder;

public class BuildPatternDemo 
{
	public static void main(String[] args) 
	{
		Account account = new Account.AccountBuilder("CURRENT ACCOUNT", 1L, "Eh Mue")
				.balance(1000.00)
				.type("CURRENT")
				.interest(2.5)
				.build();
		System.out.println(account);
		
	}

}
