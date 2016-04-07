package com.pharmacysystem.domain;
import java.util.Date;
/**
 * Created by SONY on 2016-04-07.
 */
public class Invoicexte extends Invoice
{
    private String details;
    private Date currentDate;

    public Invoicexte(Builder builder)
    {
        details = builder.details;
        currentDate = builder.currentDate;
    }

    public Date getCurrentDate()
    {
        return currentDate;
    }

    public String getDetails()
    {
        return details;
    }
    public static class Builder
    {
        private Date currentDate;
        private String details;

        public Builder (String details)
        {
            this.details = details;
        }

        public Builder currentDate(Date currentDate)
        {
            this.currentDate = currentDate;
            return this;
        }
        public Builder copy(Invoicexte invo)
        {
            this.details = invo.getDetails();
            this.currentDate = invo.getCurrentDate();
            return this;
        }
        public Invoicexte build()
        {
            return new Invoicexte(this);
        }
    }

}
