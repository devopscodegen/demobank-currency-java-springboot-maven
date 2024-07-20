package com.demobank.currency.application.currency;

import java.math.BigDecimal;

public class ConvertAmountCommand {

    private String fromCurrencyCode;
    private BigDecimal amount;
    private String toCurrencyCode;

    public ConvertAmountCommand(String fromCurrencyCode, BigDecimal amount, String toCurrencyCode) {
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

    private void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    private void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getToCurrencyCode() {
        return toCurrencyCode;
    }

    private void setToCurrencyCode(String toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }
}
