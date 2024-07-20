package com.demobank.currency.port.adapter.controller.currency;

import java.math.BigDecimal;

public class ConvertAmountResponse {
    private String status;
    private BigDecimal convertedAmount;

    public ConvertAmountResponse() {}

    public ConvertAmountResponse(String status, BigDecimal convertedAmount) {
        this.setStatus(status);
        this.setConvertedAmount(convertedAmount);
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getConvertedAmount() {
        return convertedAmount;
    }

    private void setConvertedAmount(BigDecimal currency) {
        this.convertedAmount = currency;
    }
}