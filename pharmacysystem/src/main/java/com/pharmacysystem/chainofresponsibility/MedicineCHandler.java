package com.pharmacysystem.chainofresponsibility;

/**
 * Created by student on 2016/04/07.
 */
public class MedicineCHandler extends MedicineHandler
{
    public String handleRequest(int request)
    {
        if (request > 65 & request < 70)
        {
            return "C";
        } else
        {
            return successor.handleRequest(request);
        }
    }
}
