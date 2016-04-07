package com.pharmacysystem.factory;
import com.pharmacysystem.domain.PharmacyImpl;
/**
 * Created by SONY on 2016-04-07.
 */
public class FactoryPharmacy
{
    public static PharmacyImpl getPharmacy(String pharmacyName, String pharmacyID)
    {

    PharmacyImpl myPharm = new PharmacyImpl.Builder(pharmacyID)
            .pName(pharmacyName)
            .build();
    return myPharm;
    }
}
