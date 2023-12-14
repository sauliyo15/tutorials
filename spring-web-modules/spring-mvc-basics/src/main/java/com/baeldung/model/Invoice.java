package com.baeldung.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Invoice {

    private String concept;
    private double amount;
    private int retention_percentage;

    public Invoice() {
        super();
    }

    public Invoice(String concept, double amount, int retention_percentage) {
        this.concept = concept;
        this.amount = amount;
        this.retention_percentage = retention_percentage;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getRetention_percentage() {
        return retention_percentage;
    }

    public void setRetention_percentage(int retention_percentage) {
        this.retention_percentage = retention_percentage;
    }
}
