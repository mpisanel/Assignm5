package com.pharmacysystem.chainofresponsibility;

/**
 * Created by student on 2016/04/07.
 */
public class MedicineBHandler extends MedicineHandler
{
    public String handleRequest(int request)
    {
        if(request > 70 & request < 75)
        {
            return "B";
        }else
        {
            return successor.handleRequest(request);
        }
    }
}
