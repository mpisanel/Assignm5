package com.pharmacysystem.domain;

/**
 * Created by SONY on 2016-04-07.
 */
public class PurchaseMedicineImpl implements PurchaseMedicine
{
    private int medAmount;
    private int numOfMedicine;

    public PurchaseMedicineImpl(Builder builder)
    {
        medAmount = builder.medAmount;
        numOfMedicine = builder.numOfMedicine;
    }

    public int getMedicineAmount()
    {
        return medAmount;
    }
    public int getNumOfMedicine()
    {
        return  numOfMedicine;
    }

    public static class Builder
    {
        private int medAmount;
        private int numOfMedicine;

        public Builder(int medAmount)
        {
            this.medAmount = medAmount;
        }
        public Builder numOfMed(int numOfMedicine)
        {
            this.numOfMedicine = numOfMedicine;
            return this;
        }

        public Builder copy(PurchaseMedicine purcMed)
        {
            this.medAmount = purcMed.getMedicineAmount();
            this.numOfMedicine = purcMed.getNumOfMedicine();
            return this;
        }

        public PurchaseMedicineImpl build()
        {
            return  new PurchaseMedicineImpl(this);
        }
    }
}
