package chap2_factory.model;

public class YesBank implements Bank
{

	@Override
	public Bank getBankName() 
	{
		System.out.println("YesBank");
		return null;
	}
	
	

}
