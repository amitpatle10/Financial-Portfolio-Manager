package com.example.demo.service;

import com.example.demo.entity.Portfolio;
import com.example.demo.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Override
    public Portfolio fetchTickerByName(String ticker) {
        return portfolioRepository.findByTicker(ticker);
    }

    @Override
    public List<Portfolio> fetchPortfolioList() {
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio createNewPortfolio(Portfolio portfolio) {
        return portfolioRepository.save(portfolio);
    }

    @Override
    public void deletePortfolioByID(Long tickerID) {
        portfolioRepository.deleteById(tickerID);
    }

}

