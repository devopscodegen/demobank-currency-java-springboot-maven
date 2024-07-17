package com.demobank.currency.application.currency;

public class ConvertAmountCommand {

    private String fromCurrencyCode;
    private Double amount;
    private String toCurrencyCode;

    public ConvertAmountCommand(String fromCurrencyCode, Double amount, String toCurrencyCode) {
        super();

        this.setFromCurrencyCode(fromCurrencyCode);
        this.setAmount(amount);
        this.setToCurrencyCode(toCurrencyCode);
    }

    public ConvertAmountCommand() {
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