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


    public Portfolio() {}

    public Portfolio(Long tickerID, String ticker, int shares, double purchasePrice, double value, double gainLoss, double percentChange) {
        this.tickerID = tickerID;
        this.ticker = ticker;
        this.shares = shares;

    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "tickerID=" + tickerID +
                ", ticker='" + ticker + '\'' +
                ", shares=" + shares +
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


}
