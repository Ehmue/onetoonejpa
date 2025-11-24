package com.example.demo.model;

public class Account 
{
	private long id;
	private String name;
	private Amount amount;
	public Account() 
	{
		super();
	}
	
	public Account(long id, String name, Amount amount) 
	{
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public long getId() 
	{
		return id;
	}
	
	public void setId(long id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Amount getAmount() 
	{
		return amount;
	}
	
	public void setAmount(Amount amount) 
	{
		this.amount = amount;
	}
	
}
