package com.pharmacysystem.domain;
import com.pharmacysystem.factory.FactoryAddress;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-06.
 */
public class TestAddress extends TestCase
{
    private Address address;

    public void setUp() throws Exception
    {
        address = FactoryAddress.getAddress("Khayelitsha", "Cape", "7784");
    }

    public void testAddress() throws Exception {

        Assert.assertNotNull(address);
        Assert.assertEquals(address.getStreetName(),"Khayelitsha");
    }

    public void testUpdate() throws Exception {
        Address addressUpdate = new Address.Builder(address.getStreetName())
                .copy(address)
                .postalCode("7783")
                .build();

        Assert.assertNotNull(addressUpdate);
        Assert.assertEquals(addressUpdate.getPostalCode(),"7783");
    }

}
