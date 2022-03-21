package com.stock.stock.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name = "STOCKS")
public class Stock {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "MARKET_CAP")
    private Long market_cap;

    @Column(name = "STOCK_SYMBOL")
    private String stock_symbol;
    
    @Column(name = "STOCK_NAME")
    private String stock_name;
    
    @Column(name = "ASK_MIN")
    private Double ask_min;
    
    @Column(name = "ASK_MAX")
    private Double ask_max;

    @Column(name = "BID_MIN")
    private Double bid_min;

    @Column(name = "BID_MAX")
    private Double bid_max;
    
    @Column(name = "CREATED_ON")
    private Timestamp created_on;
    
    @Column(name = "UPDATED_ON")
    private Timestamp updated_on;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(Long market_cap) {
        this.market_cap = market_cap;
    }

    public String getStock_symbol() {
        return stock_symbol;
    }

    public void setStock_symbol(String stock_symbol) {
        this.stock_symbol = stock_symbol;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public Double getAsk_min() {
        return ask_min;
    }

    public void setAsk_min(Double ask_min) {
        this.ask_min = ask_min;
    }

    public Double getAsk_max() {
        return ask_max;
    }

    public void setAsk_max(Double ask_max) {
        this.ask_max = ask_max;
    }

    public Double getBid_min() {
        return bid_min;
    }

    public void setBid_min(Double bid_min) {
        this.bid_min = bid_min;
    }

    public Double getBid_max() {
        return bid_max;
    }

    public void setBid_max(Double bid_max) {
        this.bid_max = bid_max;
    }

    public Timestamp getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Timestamp created_on) {
        this.created_on = created_on;
    }

    public Timestamp getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(Timestamp updated_on) {
        this.updated_on = updated_on;
    }


}
