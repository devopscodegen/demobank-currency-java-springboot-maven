package com.example.bank.currency.port.adapter.controller.currency;

import org.jmolecules.architecture.hexagonal.Adapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.currency.application.currency.CurrencyApplicationService;
import com.example.bank.currency.application.currency.ConvertAmountCommand;
import com.example.bank.currency.domain.model.currency.ConvertedAmount;

@RestController
@RequestMapping("/api/v1/currency")
@Adapter
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
            convertedAmount.getCurrencyStatus().toString(), 
            convertedAmount.getConvertedAmount().getAmount());
    }
}