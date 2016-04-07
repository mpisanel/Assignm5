package com.pharmacysystem.factory;
import com.pharmacysystem.domain.Prescription;
/**
 * Created by SONY on 2016-04-06.
 */
public class FactoryPrescription
{
    public static Prescription getPre(String preID, String preDate)
    {
        Prescription myPre = new Prescription.Builder(preID)
                .prescripDate(preDate)
                .build();
        return myPre;
    }
}
