package com.pharmacysystem.singleton;

/**
 * Created by SONY on 2016-04-07.
 */
public class CalculateMedicine
{
    private static CalculateMedicine calcMedicine = null;

    private CalculateMedicine(){}

    public static CalculateMedicine getCalcuMed()
    {
        if(calcMedicine == null)
        {
            calcMedicine = new CalculateMedicine();
        }
        return calcMedicine;
    }

    public int calculate(int med, int numOfMed)
    {
        return med * numOfMed;
    }
}
