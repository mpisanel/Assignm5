package com.pharmacysystem.factory;
import com.pharmacysystem.domain.AlternativeContactImpl;
/**
 * Created by SONY on 2016-04-07.
 */
public class FactoryAlternativeContact
{
    public static AlternativeContactImpl getAltiContact(String altiName, String altiContact)
    {
        AlternativeContactImpl myAlt = new AlternativeContactImpl.Builder(altiName)
                .aName(altiContact)
                .build();
        return myAlt;
    }
}
