package com.pharmacysystem.domain;

/**
 * Created by SONY on 2016-04-06.
 */
public class Prescription
{
    private String preID;
    private String preDate;

    public Prescription(Builder builder)
    {
        preID = builder.preID;
        preDate = builder.preDate;
    }

    public String getPreID()
    {
        return  preID;
    }
    public String getPreDate()
    {
        return preDate;
    }

    public static class Builder
    {
        private String preID;
        private String preDate;

        public Builder (String preID)
        {
            this.preID = preID;
        }
        public Builder prescripDate(String preDate)
        {
            this.preDate = preDate;
            return this;
        }

        public  Builder copy(Prescription pre)
        {
            this.preID = pre.getPreID();
            this.preDate = pre.getPreDate();
            return this;
        }

        public Prescription build()
        {
            return new Prescription(this);
        }
    }
}
