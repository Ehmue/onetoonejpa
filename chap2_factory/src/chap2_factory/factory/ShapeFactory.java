package chap2_factory.factory;

import chap2_factory.model.Circle;
import chap2_factory.model.Rectangle;
import chap2_factory.model.Shape;
import chap2_factory.model.Square;

public class ShapeFactory 
{
	public Shape getShape(String shape) 
	{
		if (shape.equals("Circle")) 
		{
			return new Circle();
		}
		else if (shape.equals("Square")) 
		{
			return new Square();
		}
		else if (shape.equals("Rectangle")) 
		{
			return new Rectangle();
		}
		return null;
	}
}
