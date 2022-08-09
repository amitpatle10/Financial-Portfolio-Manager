package com.example.demo.controller;


import com.example.demo.entity.nifty_50_stocks;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyController {
        @Autowired
        private CompanyRepository repo;

        // Home Page
        @GetMapping("/")
        public String welcome()
        {
            return "<html><body>"
                    + "<h1>WELCOME</h1>"
                    + "</body></html>";
        }

        // Get All Company
        @GetMapping("/company")
        public List<nifty_50_stocks> getAllCompany()
        {
            return repo.findAll();
        }

    }
