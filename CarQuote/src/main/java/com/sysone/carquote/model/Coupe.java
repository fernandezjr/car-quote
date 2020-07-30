package com.sysone.carquote.model;

import org.springframework.stereotype.Component;

@Component("coupe")
public class Coupe extends Car 
{
	@Override
	public double getBasicPrice() 
	{
		return 270000.00;
	}
}