package com.demobank.currency.domain.model.currency;

import com.demobank.currency.domain.model.money.Money;

public class ConvertedAmount {
    private Money amount;
    private CurrencyStatus currencyStatus;
    private Money convertedAmount;

    public ConvertedAmount(Money amount, CurrencyStatus currencyStatus, Money convertedAmount) {
        super();

        this.setAmount(amount);
        this.setStatus(currencyStatus);
        this.setConvertedAmount(convertedAmount);
    }

    public ConvertedAmount() {
        super();
    }

    public Money getAmount() {
        return amount;
    }

    private void setAmount(Money amount) {
        this.amount = amount;
    }

    public CurrencyStatus getStatus() {
        return currencyStatus;
    }

    private void setStatus(CurrencyStatus currencyStatus) {
        this.currencyStatus = currencyStatus;
    }

    public Money getConvertedAmount() {
        return convertedAmount;
    }

    private void setConvertedAmount(Money convertedAmount) {
        this.convertedAmount = convertedAmount;
    }
}
