package com.pharmacysystem.domain;
import com.pharmacysystem.factory.FactoryDoctor;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-07.
 */
public class TestDoctor extends TestCase
{
    private Doctor doc;

    public void setUp() throws Exception
    {
        doc = FactoryDoctor.getDoctor("D789", "Naruto");
    }
    //@Test
    public void testDoctor() throws Exception
    {
        Assert.assertEquals("D789", doc.getDoctorName());
    }

    public void testUpdate() throws Exception
    {
        Doctor docUpdate = new Doctor.Builder(doc.getDoctorID())
                .copy(doc)
                .dName("Sasuke")
                .build();

        Assert.assertNotNull(docUpdate);
        Assert.assertEquals(docUpdate.getDoctorName(),"Sasuke");
    }
}
