package chap2_factory.factory;

import chap2_factory.model.Shape;

public class FactoryPatternDemo 
{

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("Circle");
		shape.draw();
		
		Shape shape1 = shapeFactory.getShape("Square");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
	}
}
