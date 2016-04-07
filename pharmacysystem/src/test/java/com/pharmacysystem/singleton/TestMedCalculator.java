package com.pharmacysystem.singleton;
import com.pharmacysystem.singleton.CalculateMedicine;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-07.
 */
public class TestMedCalculator extends TestCase
{
    CalculateMedicine calcMedicine;

    public void setUp() throws Exception
    {
        calcMedicine = CalculateMedicine.getCalcuMed();
    }
    public void testCalMed() throws Exception
    {
        assertEquals(calcMedicine.calculate(4, 2) , calcMedicine.calculate(4, 2));
    }
}
