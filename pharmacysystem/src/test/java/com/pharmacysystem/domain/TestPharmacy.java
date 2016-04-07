package com.pharmacysystem.domain;
import com.pharmacysystem.factory.FactoryPharmacy;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-07.
 */
public class TestPharmacy extends TestCase
{
    PharmacyImpl phar;

    public void setUp() throws Exception
    {
        phar = FactoryPharmacy.getPharmacy("Mpisane", "P852");
    }

    public void testPharmacy() throws Exception
    {
        Assert.assertEquals("Mpisane", phar.getPharmacyName());
    }
}
