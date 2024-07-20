package com.demobank.currency.application.currency;

import org.springframework.stereotype.Service;

import com.demobank.currency.domain.model.currency.ConvertedAmount;
import com.demobank.currency.domain.model.currency.CurrencyCode;
import com.demobank.currency.domain.model.currency.CurrencyStatus;
import com.demobank.currency.domain.model.money.Money;

@Service
public class CurrencyApplicationService {

    public ConvertedAmount convertAmount(ConvertAmountCommand aCommand) {
        Money amount = new Money(
            aCommand.getAmount(),
            CurrencyCode.valueOf(aCommand.getFromCurrencyCode())
        );
        Money convertedAmount = new Money(
            aCommand.getAmount(),
            CurrencyCode.valueOf(aCommand.getFromCurrencyCode())
        );
        return new ConvertedAmount(
            amount,
            CurrencyStatus.SUCCESS,
            convertedAmount
        );
    }
}
