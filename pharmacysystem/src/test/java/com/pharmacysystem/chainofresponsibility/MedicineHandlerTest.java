package com.pharmacysystem.chainofresponsibility;

import junit.framework.TestCase;

/**
 * Created by student on 2016/04/07.
 */
public class MedicineHandlerTest extends TestCase
{

    MedicineHandler medD, medC, medB, medA;

    public void setUp() throws Exception
    {
        medA = new MedicineAHandler();
        medB = new MedicineBHandler();
        medC = new MedicineCHandler();
        medD = new MedicineDHandler();

    }

    public void testGrade() throws Exception
    {
        medA.setSuccessor(medB);
        medB.setSuccessor(medC);
        medC.setSuccessor(medD);

        medA.handleRequest(77);
        medA.handleRequest(72);
        medA.handleRequest(67);
        medA.handleRequest(61);
    }
}
