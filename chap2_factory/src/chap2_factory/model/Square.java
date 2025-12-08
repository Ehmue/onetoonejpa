package chap2_factory.model;

public class Square implements Shape
{

	@Override
	public Shape draw() 
	{

		System.out.println("Square");
		return null;
	}

}
