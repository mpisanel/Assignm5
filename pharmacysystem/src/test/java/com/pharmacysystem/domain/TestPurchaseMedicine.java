package com.pharmacysystem.domain;
import com.pharmacysystem.factory.FactoryPurchaseMedicine;
import com.pharmacysystem.domain.PurchaseMedicine;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-07.
 */
public class TestPurchaseMedicine extends TestCase
{
    PurchaseMedicineImpl pMed;

    public void setUp() throws Exception
    {
        pMed = FactoryPurchaseMedicine.getPurchaseMed(50, 6);
    }

    public void testPurchaseMedicine() throws Exception
    {
        Assert.assertEquals(50, pMed.getMedicineAmount());
    }

    public void testUpdate() throws Exception
    {
        PurchaseMedicineImpl pUpdate = new PurchaseMedicineImpl.Builder(pMed.getMedicineAmount())
                .copy(pMed)
                .numOfMed(3)
                .build();

        Assert.assertNotNull(pUpdate);
        Assert.assertEquals(3, pUpdate.getNumOfMedicine());
    }
}
