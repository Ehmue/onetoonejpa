package chap2_factory.model;

public class Circle implements Shape
{

	@Override
	public Shape draw() 
	{

		System.out.println("Circle");
		return null;
	}

}
