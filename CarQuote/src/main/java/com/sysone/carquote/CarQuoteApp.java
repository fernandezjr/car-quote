package com.sysone.carquote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sysone.carquote.configuration.CarQuoteConfig;
import com.sysone.carquote.model.Car;
import com.sysone.carquote.model.Optional;

public class CarQuoteApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarQuoteConfig.class);
        Car car = context.getBean("coupe", Car.class);
    	
    	car.addOptional(Optional.AB);
        
        System.out.println(car.getFinalPrice());
    }
}