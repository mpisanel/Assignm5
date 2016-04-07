package com.pharmacysystem.domain;
import com.pharmacysystem.factory.FactoryAlternativeContact;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-07.
 */
public class TestAlternativeContact extends TestCase
{
    AlternativeContactImpl alt;

    public void setUp() throws Exception
    {
        alt = FactoryAlternativeContact.getAltiContact( "0313052222","Zuzo");
    }

    public void testAlternativeC() throws Exception
    {
        Assert.assertEquals("0313052222", alt.getAlternativeContact());

    }
    public void testUpdate() throws Exception
    {
        AlternativeContactImpl docUpdate = new AlternativeContactImpl.Builder(alt.getAlternativeContact())
                .copy(alt)
                .aName("Zizo")
                .build();

        Assert.assertNotNull(docUpdate);
        Assert.assertEquals(docUpdate.getAlternativeName(),"Zizo");
    }
}
