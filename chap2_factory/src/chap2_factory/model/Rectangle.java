package chap2_factory.model;

public class Rectangle implements Shape
{

	@Override
	public Shape draw() 
	{
		System.out.println("Rectangle");
		return null;
	}

}
