package models;

import service.impl.CurrencyExchange;

public class ArgentinePeso extends CurrencyExchange {
    private final Double OPERATIONAL_FEE = 2.50;
    private final Double PERCENTAGE_OPERATIONAL_FEE = 1.5;
    private final Double QUOTE = 26.24;


    @Override
    protected Double getOperacionalFee() {
        return OPERATIONAL_FEE;
    }

    @Override
    protected Double getPercentageOperationalFee() {
        return PERCENTAGE_OPERATIONAL_FEE;
    }

    @Override
    protected Double getQuote() {
        return QUOTE;
    }

}
