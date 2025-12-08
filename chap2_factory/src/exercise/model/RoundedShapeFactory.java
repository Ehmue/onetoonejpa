package exercise.model;

import exercise.factory.AbstractFactory;

public class RoundedShapeFactory implements AbstractFactory
{

	@Override
	public Shape getShape(String shapeName) 
	{
		if (shapeName.equals("ROUNDEDRECTANGLE")) 
		{
			return new RoundedRectangle();
		}
		else if (shapeName.equals("ROUNDEDSQUARE")) 
		{
			return new RoundedSquare();
			
		}
		return null;
	}
	
	
	
}
