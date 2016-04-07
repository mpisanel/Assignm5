package com.pharmacysystem.factory;

import com.pharmacysystem.domain.Doctor;

/**
 * Created by SONY on 2016-04-06.
 */
public class FactoryDoctor
{
    public static Doctor getDoctor(String docName, String docID) {

        Doctor myDoc = new Doctor.Builder(docID)
                .dName(docName)
                .build();
        return myDoc;
    }
}
