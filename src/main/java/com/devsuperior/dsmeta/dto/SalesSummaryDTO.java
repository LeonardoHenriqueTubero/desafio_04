package com.devsuperior.dsmeta.dto;

import com.devsuperior.dsmeta.entities.Sale;

public class SalesSummaryDTO {

    private String sellerName;
    private Double amount;

    public SalesSummaryDTO() {}

    public SalesSummaryDTO(String sellerName, Double amount) {
        this.sellerName = sellerName;
        this.amount = amount;
    }

    public SalesSummaryDTO(Sale sale) {
        sellerName = sale.getSeller().getName();
        amount= sale.getAmount();
    }

    public Double getAmount() {
        return amount;
    }

    public String getSellerName() {
        return sellerName;
    }
}
