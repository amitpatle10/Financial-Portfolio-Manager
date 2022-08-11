package com.example.demo.controller;


import com.example.demo.entity.nifty_50_stocks;
import com.example.demo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CompanyController {
        @Autowired
        private CompanyRepository repo;

        // Home Page
        @GetMapping("/")
        public String welcome(Model model)
        {
            List<nifty_50_stocks> list_of_companies = repo.findAll();
            model.addAttribute("ListOfCompanies", list_of_companies);
            return "index";
        }

        // Get All Company
        @GetMapping("/company")
        public String getAllCompany(Model model)
        {
            List<nifty_50_stocks> list_of_companies = repo.findAll();
            model.addAttribute("ListOfCompanies", list_of_companies);
            return "ListOfCompanies";
        }

    }
