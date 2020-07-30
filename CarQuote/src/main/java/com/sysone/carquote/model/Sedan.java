package com.sysone.carquote.model;

import org.springframework.stereotype.Component;

@Component("sedan")
public class Sedan extends Car
{
	@Override
	public double getBasicPrice()
	{
		return 230000.00;
	}
}