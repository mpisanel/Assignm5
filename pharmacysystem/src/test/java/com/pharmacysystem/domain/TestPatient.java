package com.pharmacysystem.domain;

import com.pharmacysystem.factory.FactoryPatient;
import junit.framework.TestCase;
import junit.framework.Assert;
/*import org.junit.Before;
import org.junit.Test;*/
/**
 * Created by SONY on 2016-04-06.
 */

public class TestPatient extends TestCase
{
    private Patient pat;

    //@Before
    public void setUp() throws Exception
    {
        pat = FactoryPatient.getPatient("Luxolo", "Zuzu", "1834");
    }
    //@Test
    public void testPatient() throws Exception
    {
        Assert.assertEquals("Luxolo", pat.getPatientName());
    }

    public void testUpdate() throws Exception
    {
        Patient patUpdate = new Patient.Builder(pat.getMedicalAidNum())
                .copy(pat)
                .medAidName("Lulu")
                .build();

        Assert.assertNotNull(patUpdate);
        Assert.assertEquals(patUpdate.getMedicalAidName(),"Lulu");
    }
}
