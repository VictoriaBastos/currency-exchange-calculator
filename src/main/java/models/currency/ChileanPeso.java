package models.currency;

import service.exchangeService.CurrencyExchangeImpl;

public class ChileanPeso extends CurrencyExchangeImpl {
    private final Double OPERATIONAL_FEE = 10.00;
    private final Double PERCENTAGE_OPERATIONAL_FEE = 0.025;
    private final Double QUOTE = 174.17;
    private final String CURRENCY_CODE = "CLP";

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
