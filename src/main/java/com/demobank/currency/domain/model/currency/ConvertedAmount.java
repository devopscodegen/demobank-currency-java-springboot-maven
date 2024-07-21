package com.demobank.currency.domain.model.currency;

import org.jmolecules.ddd.annotation.ValueObject;
import com.demobank.currency.domain.model.money.Money;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@ValueObject
public class ConvertedAmount {
    private Money amount;
    private CurrencyStatus currencyStatus;
    private Money convertedAmount;
}
