package com.pharmacysystem.factory;
import com.pharmacysystem.domain.Address;
/**
 * Created by SONY on 2016-04-06.
 */
public class FactoryAddress
{
    public static Address getAddress(String streetName, String city, String postalCode)
    {
        Address myAdress = new Address.Builder(streetName)
                .city(city)
                .postalCode(postalCode)
                .build();

        return myAdress;
    }
}
