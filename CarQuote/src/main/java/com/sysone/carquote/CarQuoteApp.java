package com.sysone.carquote;

import com.sysone.carquote.model.Car;
import com.sysone.carquote.model.Coupe;
import com.sysone.carquote.model.Family;
import com.sysone.carquote.model.Optional;
import com.sysone.carquote.model.Sedan;

public class CarQuoteApp 
{
    public static void main( String[] args )
    {
        Car coupe = new Coupe();
        Car sedan = new Sedan();
        Car family = new Family();
        
        coupe.addOptional(Optional.AB);
        sedan.addOptional(Optional.AB);
        family.addOptional(Optional.AB);
        
        System.out.println(coupe.getFinalPrice());
    }
}