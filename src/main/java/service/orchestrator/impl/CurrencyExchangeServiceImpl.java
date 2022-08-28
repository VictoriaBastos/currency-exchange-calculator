package service.orchestrator.impl;

import factory.CurrencyExchangeFactory;
import models.user.InputUser;
import models.user.OutputUser;
import service.exchangeService.CurrencyExchangeImpl;
import service.orchestrator.CurrencyExchangeService;

public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

    private final CurrencyExchangeFactory currencyExchangeFactory;
    private final String INITIAL_CURRENCY = "BRL";

    public CurrencyExchangeServiceImpl(CurrencyExchangeFactory currencyExchangeFactory) {
        this.currencyExchangeFactory = currencyExchangeFactory;
    }

    private CurrencyExchangeImpl selectInputCurrency(InputUser input){
        return this.currencyExchangeFactory.getCurrency(input);
    }

    private Double getExchangedValue(InputUser input){
        return selectInputCurrency(input).getExchangedValue(input);
    }
    public OutputUser getExchangeOutput(InputUser inputUser){
        return new OutputUser(
                inputUser.getInputValue(),
                this.INITIAL_CURRENCY,
                selectInputCurrency(inputUser).getIOF(),
                selectInputCurrency(inputUser).getTotalOperationalFee(inputUser),
                getExchangedValue(inputUser),
                selectInputCurrency(inputUser).getCurrency()
        );
    }
}
