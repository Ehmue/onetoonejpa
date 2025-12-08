package chap2_factory.model;

public class ICICIBank implements Bank
{

	@Override
	public Bank getBankName() 
	{
		System.out.println("iciciBank");
		return null;
	}

}
