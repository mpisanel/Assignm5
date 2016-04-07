package com.pharmacysystem.domain;
import  com.pharmacysystem.factory.FactoryInvoice;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-07.
 */
public class TestInvoice extends TestCase
{
    private Invoicexte inv;

    public void setUp() throws Exception
    {
        inv = FactoryInvoice.getInvo( "Albino, Fever");
    }

    public void testInvoice() throws Exception
    {
        Assert.assertEquals("Albino, Fever", inv.getDetails());
    }
}
