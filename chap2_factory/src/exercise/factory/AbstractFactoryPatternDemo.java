package exercise.factory;

import exercise.model.Shape;

public class AbstractFactoryPatternDemo 
{
	public static void main(String[] args) {
		
		FactoryProducer factoryProducer = new FactoryProducer();
		AbstractFactory shapeFactory = factoryProducer.getFactory("SHAPEFACTORY");
		AbstractFactory roundedShapeFactory = factoryProducer.getFactory("ROUNDEDSHAPEFACTORY");
		
		Shape squareShape = shapeFactory.getShape("SQUARE");
		squareShape.draw();
		
		Shape roundedShape = roundedShapeFactory.getShape("ROUNDEDRECTANGLE");
		roundedShape.draw();
	}
}
