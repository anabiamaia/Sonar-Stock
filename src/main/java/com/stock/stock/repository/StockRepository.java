package com.stock.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stock.stock.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{
    
}

