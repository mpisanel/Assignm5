package com.pharmacysystem.factory;
import com.pharmacysystem.domain.Invoicexte;

import java.util.Date;

/**
 * Created by SONY on 2016-04-07.
 */
public class FactoryInvoice
{
    public static Invoicexte getInvo(  String details)
    {
        Invoicexte myInv = new Invoicexte.Builder(details)
                .build();

        return myInv;
    }
}
