package com.pharmacysystem.domain;

/**
 * Created by SONY on 2016-04-07.
 */
public class AlternativeContactImpl implements AlternativeContact
{

    private String altiName;
    private String altiCell;

    public AlternativeContactImpl(Builder builder)
    {
        altiName = builder.altiName;
        altiCell = builder.altiCell;
    }

    public String getAlternativeName()
    {
        return altiName;
    }
    public String getAlternativeContact()
    {
        return altiCell;
    }

    public static class Builder
    {
        private String altiName;
        private String altiCell;

        public Builder aName(String altiName)
        {
            this.altiName = altiName;
            return this;
        }
        public Builder(String altiCell)
        {
            this.altiCell = altiCell;
        }
        public Builder copy(AlternativeContactImpl altCon)
        {
            this.altiName = altCon.altiName;
            this.altiCell = altCon.altiCell;
            return this;
        }

        public AlternativeContactImpl build()
        {
            return new AlternativeContactImpl(this);
        }
    }
}
