package com.pharmacysystem.domain;

/**
 * Created by SONY on 2016-04-07.
 */
public class MedicineImpl implements Medicine
{
    private String medicineID;
    private String medicineName;

    public MedicineImpl(Builder builder)
    {
        medicineID = builder.medicineID;
        medicineName = builder.medicineName;
    }

    public String getMedicineID()
    {
        return medicineID;
    }
    public String getMedicineName()
    {
        return medicineName;
    }

    public static class Builder
    {
        private String medicineID;
        private String medicineName;

        public  Builder(String medicineID)
        {
            this.medicineID = medicineID;
        }
        public Builder medName(String medicineName)
        {
            this.medicineName = medicineName;
            return this;
        }

        public Builder copy(MedicineImpl medImpl)
        {
            this.medicineID = medImpl.getMedicineID();
            this.medicineName = medImpl.getMedicineName();
            return this;
        }

        public MedicineImpl build()
        {
            return new MedicineImpl(this);
        }
    }


}
