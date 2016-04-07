package com.pharmacysystem.chainofresponsibility;

/**
 * Created by student on 2016/04/07.
 */
public class MedicineAHandler extends MedicineHandler
{
    public String handleRequest(int request)
    {
        if(request > 75)
        {
            return "A";
        }else
        {
            return successor.handleRequest(request);
        }
    }
}