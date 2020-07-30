package com.sysone.carquote.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Car
{
	private List<Optional> optionals;
	
	public Car() 
	{
		optionals = new ArrayList<Optional>();
	}

	public abstract double getBasicPrice();
	
	public void addOptional(Optional newOptional)
	{
		optionals.add(newOptional);
	}
	
	public double getOptionalsTotalPrice()
	{
		double totalPrice = 0;
		
		for (Optional optional : optionals) 
		{
			totalPrice += optional.getPrice();
		}
		
		return totalPrice;
	}

	public double getFinalPrice() 
	{
		return getBasicPrice() + getOptionalsTotalPrice();
	}
}