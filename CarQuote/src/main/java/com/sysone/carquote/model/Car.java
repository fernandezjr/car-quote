package com.sysone.carquote.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Car
{
	private double finalPrice;
	private List<Optional> optionals;
	
	public Car() 
	{
		finalPrice = 0;
		optionals = new ArrayList<Optional>();
	}

	public abstract double getBasicPrice();
	
	public void addOptional(Optional newOptional)
	{
		optionals.add(newOptional);
		finalPrice += newOptional.getPrice();
	}

	public double getFinalPrice() 
	{
		return getBasicPrice() + finalPrice;
	}
}