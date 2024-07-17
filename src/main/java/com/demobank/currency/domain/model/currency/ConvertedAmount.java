package com.demobank.currency.domain.model.currency;

public class ConvertedAmount {
    private CurrencyCode fromCurrencyCode;
    private Double amount;
    private CurrencyCode toCurrencyCode;
    private CurrencyStatus currencyStatus;
    private Double convertedAmount;

    public ConvertedAmount(CurrencyCode fromCurrencyCode, Double amount, CurrencyCode toCurrencyCode, CurrencyStatus currencyStatus, Double convertedAmount) {
        super();

        this.setFromCurrencyCode(fromCurrencyCode);
        this.setAmount(amount);
        this.setToCurrencyCode(toCurrencyCode);
        this.setStatus(currencyStatus);
        this.setConvertedAmount(convertedAmount);
    }

    public ConvertedAmount() {
        super();
    }

    public CurrencyCode getFromCurrencyCode() {
        return fromCurrencyCode;
    }

    public void setFromCurrencyCode(CurrencyCode fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CurrencyCode getToCurrencyCode() {
        return toCurrencyCode;
    }

    public void setToCurrencyCode(CurrencyCode toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }

    public CurrencyStatus getStatus() {
        return currencyStatus;
    }

    public void setStatus(CurrencyStatus currencyStatus) {
        this.currencyStatus = currencyStatus;
    }

    public Double getConvertedAmount() {
        return convertedAmount;
    }

    public void setConvertedAmount(Double convertedAmount) {
        this.convertedAmount = convertedAmount;
    }
}
