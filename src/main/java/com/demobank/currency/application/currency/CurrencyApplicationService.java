package com.demobank.currency.application.currency;

import org.jmolecules.architecture.hexagonal.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demobank.currency.domain.model.currency.ConvertedAmount;
import com.demobank.currency.domain.model.currency.CurrencyCode;
import com.demobank.currency.domain.model.currency.CurrencyService;
import com.demobank.currency.domain.model.money.Money;

@Service
@Application
public class CurrencyApplicationService {

    @Autowired
    private CurrencyService currencyService;

    public ConvertedAmount convertAmount(ConvertAmountCommand aCommand) {
        return currencyService.convertAmount(
            new Money(
                aCommand.getAmount(),
                CurrencyCode.valueOf(aCommand.getFromCurrencyCode())
            ),
            CurrencyCode.valueOf(aCommand.getToCurrencyCode())
        );            
    }
}
