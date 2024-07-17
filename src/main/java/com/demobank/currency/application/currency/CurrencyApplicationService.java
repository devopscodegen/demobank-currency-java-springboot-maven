package com.demobank.currency.application.currency;

import org.springframework.stereotype.Service;

import com.demobank.currency.domain.model.currency.ConvertedAmount;
import com.demobank.currency.domain.model.currency.CurrencyCode;
import com.demobank.currency.domain.model.currency.CurrencyStatus;

@Service
public class CurrencyApplicationService {

    public ConvertedAmount convertAmount(ConvertAmountCommand aCommand) {
        return new ConvertedAmount(
            CurrencyCode.valueOf(aCommand.getFromCurrencyCode()),
            aCommand.getAmount(), 
            CurrencyCode.valueOf(aCommand.getToCurrencyCode()), 
            CurrencyStatus.SUCCESS,
            aCommand.getAmount());
    }
}
