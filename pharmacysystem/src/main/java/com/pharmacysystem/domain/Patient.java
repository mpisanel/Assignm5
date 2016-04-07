package com.pharmacysystem.domain;

/**
 * Created by SONY on 2016-04-06.
 */
public class Patient
{
    private String patientName;
    private String medicalAidName;
    private String medicalAidNum;

    public Patient(Builder builder)
    {
        patientName = builder.patientName;
        medicalAidName = builder.medicalAidName;
        medicalAidNum = builder.medicalAidNum;
    }

    public String getPatientName()
            {
        return patientName;
    }
    public String getMedicalAidName()
    {
        return medicalAidName;
    }
    public String getMedicalAidNum()
    {
        return medicalAidNum;
    }

    public static class Builder
    {
        private String patientName;
        private String medicalAidName;
        private String medicalAidNum;

        public Builder pName(String patientName)
        {
            this.patientName = patientName;
            return this;
        }
        public Builder(String medicalAidNum)
        {
            this.medicalAidNum = medicalAidNum;
        }
        public Builder medAidName(String medicalAidName)
        {
            this.medicalAidName = medicalAidName;
            return this;
        }

        public Builder copy(Patient pat)
        {
            this.patientName = pat.patientName;
            this.medicalAidName = pat.medicalAidName;
            this.medicalAidNum = pat.medicalAidNum;
            return this;
        }

        public Patient build()
        {
            return new Patient(this);
        }
    }

}
