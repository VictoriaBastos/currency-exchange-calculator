package models;

import service.impl.CurrencyExchange;

public class Dollar extends CurrencyExchange {
    private final Double OPERATIONAL_FEE = 5.00;
    private final Double PERCENTAGE_OPERATIONAL_FEE = 3.0;
    private final Double QUOTE = 0.19;


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
