package exercise.factory;

import exercise.model.Rectangle;
import exercise.model.RoundedShapeFactory;
import exercise.model.ShapeFactory;
import exercise.model.Square;

public class FactoryProducer
{
	public AbstractFactory getFactory(String factory) 
	{
		if (factory.equals("SHAPEFACTORY")) 
		{
			return new ShapeFactory();
		}
		else if (factory.equals("ROUNDEDSHAPEFACTORY")) 
		{
			return new RoundedShapeFactory();
			
		}
		return null;
		
	}

}
