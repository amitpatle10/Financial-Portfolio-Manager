package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tickerID;
    private String ticker;
    private int shares;
    private double purchasePrice;
    private double value;
    //private double currentPrice;
    private double gainLoss;
    private double percentChange;

    public Portfolio() {}

    public Portfolio(Long tickerID, String ticker, int shares, double purchasePrice, double value, double gainLoss, double percentChange) {
        this.tickerID = tickerID;
        this.ticker = ticker;
        this.shares = shares;
        this.purchasePrice = purchasePrice;
        this.value = value;
        this.gainLoss = gainLoss;
        this.percentChange = percentChange;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "tickerID=" + tickerID +
                ", ticker='" + ticker + '\'' +
                ", shares=" + shares +
                ", purchasePrice=" + purchasePrice +
                ", value=" + value +
                ", gainLoss=" + gainLoss +
                ", percentChange=" + percentChange +
                '}';
    }

    public Long getTickerID() {
        return tickerID;
    }

    public void setTickerID(Long tickerID) {
        this.tickerID = tickerID;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getGainLoss() {
        return gainLoss;
    }

    public void setGainLoss(double gainLoss) {
        this.gainLoss = gainLoss;
    }

    public double getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }
}
