package com.example.bank.currency.domain.model.currency;

import org.springframework.stereotype.Service;

import com.example.bank.currency.domain.model.money.Money;

@Service
@org.jmolecules.ddd.annotation.Service
public class CurrencyService {

    public ConvertedAmount convertAmount(Money amount, CurrencyCode currencyCode) {
        return new ConvertedAmount(
            amount,
            CurrencyStatus.SUCCESS,
            new Money(
                amount.getAmount(),
                currencyCode)
        );
    }
}
