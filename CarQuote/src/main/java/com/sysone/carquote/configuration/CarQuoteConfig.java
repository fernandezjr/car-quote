package com.sysone.carquote.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sysone.carquote.model.Coupe;
import com.sysone.carquote.model.Family;
import com.sysone.carquote.model.Sedan;

@Configuration
public class CarQuoteConfig
{
	@Bean
	public Sedan sedanBean()
	{
		return new Sedan();
	}
	
	@Bean
	public Family familyBean()
	{
		return new Family();
	}
	
	@Bean
	public Coupe coupeBean()
	{
		return new Coupe();
	}
}