package com.stock.stock.dto.stock;

import java.sql.Timestamp;

import com.stock.stock.model.Stock;

import lombok.Data;

@Data
public class GetAllStockDto {
    private Long id;
    private Long market_cap;
    private String stock_symbol;
    private String stock_name;
    private Double ask_min;
    private Double ask_max;
    private Double bid_min;
    private Double bid_max;
    private Timestamp created_on;
    private Timestamp updated_on;

    public GetAllStockDto(Stock stock){
        this.id = stock.getId();
        this.market_cap = stock.getMarket_cap();
        this.stock_symbol = stock.getStock_symbol();
        this.stock_name = stock.getStock_name();
        this.ask_min = stock.getAsk_min();
        this.ask_max = stock.getAsk_max();
        this.bid_max = stock.getBid_max();
        this.bid_min = stock.getBid_min();
        this.created_on = stock.getCreated_on();
        this.updated_on = stock.getUpdated_on();
    }
}
