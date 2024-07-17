package com.demobank.currency.port.adapter.controller.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demobank.currency.application.currency.CurrencyApplicationService;
import com.demobank.currency.application.currency.ConvertAmountCommand;
import com.demobank.currency.domain.model.currency.ConvertedAmount;

@RestController
@RequestMapping("/api/v1/currency")
public class CurrencyController {
    @Autowired
    private CurrencyApplicationService currencyApplicationService;

    @PostMapping("/{currencyCode}/convert")
    public ConvertAmountResponse convertAmount(@PathVariable String currencyCode, @RequestBody ConvertAmountRequest request) {
        ConvertedAmount convertedAmount = this.currencyApplicationService.convertAmount(
            new ConvertAmountCommand(
                currencyCode,
                request.getAmount(),
                request.getToCurrencyCode()));
                
        return new ConvertAmountResponse(
            convertedAmount.getStatus().toString(), 
            convertedAmount.getConvertedAmount());
    }
}