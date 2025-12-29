package builder.exercise.model;

public class Pepsi implements ColdDrink
{
	public String name = "Pepsi";
	public double price = 20.00;

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
