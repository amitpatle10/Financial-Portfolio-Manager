package com.example.demo.controller;

import com.example.demo.entity.Portfolio;
import com.example.demo.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;
import java.util.List;

@RestController
public class PortfolioController {


    @Autowired
    private PortfolioService portfolioService;

    // GET - method to get the portfolio of a specific owner
    @GetMapping("/portfolio/ticker/{ticker}")
    public Portfolio getPortfolio(@PathVariable("ticker") String ticker){
        return portfolioService.fetchTickerByName(ticker);
    }

    // GET - method to get all the portfolios
    @GetMapping("/portfolio")
    public List<Portfolio> fetchPortfolioList(){
        return portfolioService.fetchPortfolioList();
    }

    //POST - method to create a portfolio
    @PostMapping("/stockbuy")
    public List<Portfolio> createNewPortfolio(@RequestParam String ticker, @RequestParam int shares){
        Portfolio portfolio = new Portfolio();

        portfolio.setTicker(ticker);
        portfolio.setShares(shares);

        portfolioService.createNewPortfolio(portfolio);

        return portfolioService.fetchPortfolioList();
    }

    //DELETE - method to delete a portfolio
    @DeleteMapping("/portfolio/{id}")
    public String deletePortfolioByID(@PathVariable("id") Long tickerID){
        portfolioService.deletePortfolioByID(tickerID);
        return "Portfolio deleted successfully!";
    }

}
