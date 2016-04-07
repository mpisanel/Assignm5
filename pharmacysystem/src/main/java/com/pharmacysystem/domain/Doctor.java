package com.pharmacysystem.domain;

/**
 * Created by SONY on 2016-04-06.
 */
public class Doctor implements DocInterface
{
    private String doctorName;
    private String doctorID;

    public Doctor(Builder builder)
    {
        doctorName = builder.doctorName;
        doctorID = builder.doctorID;
    }

    public String getDoctorName()
    {
        return doctorName;
    }
    public String getDoctorID()
    {
        return doctorID;
    }

    public static class Builder
    {
        private String doctorName;
        private String doctorID;

        public Builder dName(String doctorName)
        {
            this.doctorName = doctorName;
            return this;
        }
        public Builder(String doctorID)
        {
            this.doctorID = doctorID;
        }

        public Builder copy(Doctor pat)
        {
            this.doctorName = pat.doctorName;
            this.doctorID = pat.doctorID;
            return this;
        }

        public Doctor build()
        {
            return new Doctor(this);
        }
    }

}
