package com.sysone.carquote.model;

import org.springframework.stereotype.Component;

@Component("family")
public class Family extends Car 
{
	@Override
	public double getBasicPrice() 
	{
		return 245000.00;
	}
}