package com.pharmacysystem.factory;
import com.pharmacysystem.domain.MedicineImpl;
/**
 * Created by SONY on 2016-04-07.
 */
public class FactoryMedicine
{
    public static MedicineImpl getMedicine(String medicineId, String medicineName)
    {
        MedicineImpl myMed = new MedicineImpl.Builder(medicineId)
                .medName(medicineName)
                .build();
        return myMed;
    }
}
