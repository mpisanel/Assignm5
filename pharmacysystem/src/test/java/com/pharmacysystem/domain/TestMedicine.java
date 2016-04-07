package com.pharmacysystem.domain;
import com.pharmacysystem.factory.FactoryMedicine;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-07.
 */
public class TestMedicine extends TestCase
{
    private MedicineImpl med;

    public void setUp() throws Exception
    {
        med = FactoryMedicine.getMedicine("M254", "Fever");
    }

    public void testMedicine() throws Exception
    {
        Assert.assertEquals("M254", med.getMedicineID());
    }

    public void testUpdate() throws Exception
    {
        MedicineImpl medUpdate = new MedicineImpl.Builder(med.getMedicineID())
                .copy(med)
                .medName("Fluenza")
                .build();

        Assert.assertNotNull(medUpdate);
        Assert.assertEquals(medUpdate.getMedicineName(),"Fluenza");
    }
}
