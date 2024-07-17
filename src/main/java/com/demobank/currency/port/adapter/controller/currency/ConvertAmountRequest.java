package com.demobank.currency.port.adapter.controller.currency;

public class ConvertAmountRequest {

    private String fromCurrencyCode;
    private Double amount;
    private String toCurrencyCode;

    public ConvertAmountRequest(String fromCurrencyCode, Double amount, String toCurrencyCode) {
        super();

        this.setFromCurrencyCode(fromCurrencyCode);
        this.setAmount(amount);
        this.setToCurrencyCode(toCurrencyCode);
    }

    public ConvertAmountRequest() {
        super();
    }
    
    public String getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(String toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }
}