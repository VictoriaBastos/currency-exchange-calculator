package models.currency;

import service.exchangeService.CurrencyExchange;

public class Dollar extends CurrencyExchange {
    private final Double OPERATIONAL_FEE = 5.00;
    private final Double PERCENTAGE_OPERATIONAL_FEE = 0.03;
    private final Double QUOTE = 0.19;
    private final String CURRENCY_CODE = "USD";

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
