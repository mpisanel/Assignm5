package com.pharmacysystem.factory;
import com.pharmacysystem.domain.PurchaseMedicineImpl;
/**
 * Created by SONY on 2016-04-07.
 */
public class FactoryPurchaseMedicine
{
    public static PurchaseMedicineImpl getPurchaseMed(int medAmount, int numOfMedicine)
    {
        PurchaseMedicineImpl myPurch = new PurchaseMedicineImpl.Builder(medAmount)
                .numOfMed(numOfMedicine)
                .build();

        return myPurch;
    }
}
