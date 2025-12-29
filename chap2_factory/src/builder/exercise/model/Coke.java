package builder.exercise.model;

public class Coke implements ColdDrink
{
	public String name = "Coke";
	public double price = 30.00;

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
