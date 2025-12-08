package chap2_factory.model;

public class CurrentAccount implements Account
{

	@Override
	public void accountType() 
	{	
		System.out.println("Current Accuont");
	}

}
