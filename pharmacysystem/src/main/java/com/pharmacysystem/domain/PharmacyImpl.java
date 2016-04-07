package com.pharmacysystem.domain;

/**
 * Created by SONY on 2016-04-07.
 */
public class PharmacyImpl implements Pharmacy
{
    private String pharmacyID;
    private String pharmacyName;

    public PharmacyImpl(Builder builder)
    {
        pharmacyID = builder.pharmacyID;
        pharmacyName = builder.pharmacyName;

    }

    public String getPharmacyName()
    {
        return pharmacyName;
    }
    public String getPharmacyID()
    {
        return pharmacyID;
    }

    public static class Builder
    {
        private String pharmacyName;
        private String pharmacyID;

        public Builder pName(String pharmacyName)
        {
            this.pharmacyName = pharmacyName;
            return this;
        }
        public Builder(String pharmacyID)
        {
            this.pharmacyID = pharmacyID;
        }

        public Builder copy(PharmacyImpl pat)
        {
            this.pharmacyName = pat.pharmacyName;
            this.pharmacyID = pat.pharmacyID;
            return this;
        }

        public PharmacyImpl build()
        {
            return new PharmacyImpl(this);
        }
    }
}
