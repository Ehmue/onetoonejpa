package builder.exercise.model;

public class VegBurger implements Burger
{

	public String name = "VegBurger";
	public double price = 80.00;
	@Override
	public String name() 
	{
		return name;
		
	}
	@Override
	public double price()
	{
		return price;
	}
	

}
