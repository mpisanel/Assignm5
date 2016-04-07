package com.pharmacysystem.domain;
import com.pharmacysystem.domain.Prescription;
import com.pharmacysystem.factory.FactoryPrescription;
import junit.framework.Assert;
import junit.framework.TestCase;

//import org.junit.Before;
/**
 * Created by SONY on 2016-04-06.
 */
public class TestPrescription extends TestCase
{
    private Prescription pre;

    //@Before
    public void setUp() throws Exception
    {
        pre = FactoryPrescription.getPre("X300", "11/April/2016");
    }

    //@Test

    public void testPrescription() throws Exception
    {
        Assert.assertEquals("X300", pre.getPreID());
    }
    public void testUpdate() throws Exception
    {
        Prescription preUpdate = new Prescription.Builder(pre.getPreID())
                .copy(pre)
                .prescripDate("23/April/2016")
                .build();

        Assert.assertNotNull(preUpdate);
        Assert.assertEquals(preUpdate.getPreDate(),"23/April/2016");
    }

}
