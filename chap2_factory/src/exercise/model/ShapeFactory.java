package exercise.model;

import exercise.factory.AbstractFactory;

public class ShapeFactory implements AbstractFactory
{

	@Override
	public Shape getShape(String shapeName) 
	{
		if (shapeName.equals("RECTANGLE")) 
		{
			return new Rectangle();
		}
		else if (shapeName.equals("SQUARE")) 
		{
			return new Square();
			
		}
		return null;
	}

}
