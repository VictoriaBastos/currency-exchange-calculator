package models.currency;

import service.exchangeService.CurrencyExchange;

public class ArgentinePeso extends CurrencyExchange{
    private final Double OPERATIONAL_FEE = 2.50;
    private final Double PERCENTAGE_OPERATIONAL_FEE = 0.015;
    private final Double QUOTE = 26.24;
    private final String CURRENCY_CODE = "ARS";

    @Override
    protected Double getOperationalFee() {
        return this.OPERATIONAL_FEE;
    }

    @Override
    protected Double getPercentageOperationalFee() {
        return this.PERCENTAGE_OPERATIONAL_FEE;
    }

    @Override
    protected Double getQuote() {
        return this.QUOTE;
    }

    @Override
    protected String getCurrencyCode() {
        return this.CURRENCY_CODE;
    }


}
