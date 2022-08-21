package models;

import service.impl.CurrencyExchange;

public class ChileanPeso extends CurrencyExchange {
    private final Double OPERATIONAL_FEE = 10.00;
    private final Double PERCENTAGE_OPERATIONAL_FEE = 2.5;
    private final Double QUOTE = 174.17;


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
