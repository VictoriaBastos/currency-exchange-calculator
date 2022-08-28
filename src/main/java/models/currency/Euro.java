package models.currency;

import service.exchangeService.CurrencyExchangeImpl;

public class Euro extends CurrencyExchangeImpl {
    private final Double OPERATIONAL_FEE = 6.00;
    private final Double QUOTE = 0.20;
    private final Double PERCENTAGE_OPERATIONAL_FEE = 0.0;
    private final String CURRENCY_CODE = "EUR";

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