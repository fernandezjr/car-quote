package com.sysone.carquote.model;

public enum Optional
{
	TC("Techo Corredizo", 12000.00), AA("Aire Acondicionado", 20000.00), 
	ABS("Sistema de Frenos ABS", 14000.00), AB("Airbag", 7000.00), 
	LL("Llantas de Aleacion", 12000.00);
	
	private String name;
	private double price;
	
	private Optional(String name, double price)
	{
		this.name = name;
		this.price = price;
	}

	public String getName() 
	{
		return name;
	}

	public double getPrice() 
	{
		return price;
	}
}