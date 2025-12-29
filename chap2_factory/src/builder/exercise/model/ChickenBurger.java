package builder.exercise.model;

public class ChickenBurger implements Burger
{
	public String name = "Chicken";
	public double Price = 100.00;

	@Override
	public String name() 
	{
		return name;
		
	}

	@Override
	public double price() 
	{

		return Price;
	}
	

}
