package com.pharmacysystem.chainofresponsibility;

/**
 * Hello world!
 *
 */
public abstract class MedicineHandler
{
    MedicineHandler successor;
    public void setSuccessor(MedicineHandler successor)
    {
        this.successor = successor;
    }
    public abstract String handleRequest(int request);
}
