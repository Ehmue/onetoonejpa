package exercise.factory;

import exercise.model.Shape;

public interface AbstractFactory {
	
	public Shape getShape(String shapeName);

}
