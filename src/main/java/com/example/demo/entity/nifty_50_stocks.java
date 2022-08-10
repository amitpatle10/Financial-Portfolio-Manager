package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class nifty_50_stocks {


    @Id
    private String SYMBOL;
    private String Open;
    private String High;
    private String Low;

    private Double OneYearChange;
    private String VALUE;


    public nifty_50_stocks() {
    }

    public nifty_50_stocks(String SYMBOL, String open, String high, String low, Double OneYearChange, String VALUE) {

        this.SYMBOL = SYMBOL;
        Open = open;
        High = high;
        Low = low;
        this.OneYearChange = OneYearChange;
        this.VALUE = VALUE;
    }



    public String getSYMBOL() {
        return SYMBOL;
    }

    public void setSYMBOL(String SYMBOL) {
        this.SYMBOL = SYMBOL;
    }

    public String getOpen() {
        return Open;
    }

    public void setOpen(String open) {
        Open = open;
    }

    public String getHigh() {
        return High;
    }

    public void setHigh(String high) {
        High = high;
    }

    public String getLow() {
        return Low;
    }

    public void setLow(String low) {
        Low = low;
    }

    public Double getOneYearChange() {
        return OneYearChange;
    }

    public void setOneYearChange(Double oneYearChange) {
        OneYearChange = oneYearChange;
    }

    public String getVALUE() {
        return VALUE;
    }

    public void setVALUE(String VALUE) {
        this.VALUE = VALUE;
    }
}
