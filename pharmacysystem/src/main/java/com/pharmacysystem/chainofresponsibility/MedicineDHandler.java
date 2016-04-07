package com.pharmacysystem.chainofresponsibility;

/**
 * Created by student on 2016/04/07.
 */
public class MedicineDHandler extends MedicineHandler
{
    public String handleRequest(int request) {
        if(request > 60 & request < 65){
            return "D";
        }else{
            return successor.handleRequest(request);
        }
    }
}