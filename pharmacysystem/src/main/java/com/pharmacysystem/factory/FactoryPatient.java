package com.pharmacysystem.factory;

import com.pharmacysystem.domain.Patient;
/**
 * Created by SONY on 2016-04-06.
 */
public class FactoryPatient
{
    public static Patient getPatient(String patName, String medAidName, String medAidNum)
    {
        Patient myPat = new Patient.Builder(medAidNum)
                .pName(patName)
                .medAidName(medAidName)
                .build();
        return myPat;
    }
}
