package com.example.demo.service;

import com.example.demo.entity.Portfolio;

import java.util.List;

public interface PortfolioService {

    public Portfolio fetchTickerByName(String ticker);

    public List<Portfolio> fetchPortfolioList();

    public Portfolio createNewPortfolio(Portfolio portfolio);

    public void deletePortfolioByID(Long tickerID);
}
