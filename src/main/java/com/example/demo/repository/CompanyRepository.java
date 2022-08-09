package com.example.demo.repository;

import com.example.demo.entity.nifty_50_stocks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface CompanyRepository extends CrudRepository<nifty_50_stocks, Integer> {
    List<nifty_50_stocks> findAll();
}
