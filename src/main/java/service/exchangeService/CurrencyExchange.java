package service.exchangeService;

import models.user.InputUser;

abstract public class CurrencyExchange implements Exchangeble {

    protected abstract Double getOperationalFee();
    protected abstract Double getPercentageOperationalFee();
    protected abstract Double getQuote();
    protected abstract String getCurrencyCode();
    private final Double IOF = 0.011;

    private Double calculateExchangedValue(InputUser inputUser) {
        Double value = inputUser.getInputValue();

        return (value - (value * IOF) - (getOperationalFee() + (value * getPercentageOperationalFee()))) * getQuote();
    }

    @Override
    public Double getExchangedValue(InputUser inputUser) {
        return calculateExchangedValue(inputUser);
    }

    public Double getTotalOperationalFee(InputUser inputUser){
        Double value = inputUser.getInputValue();
        return (getOperationalFee() + (value * getPercentageOperationalFee()));
    }

    public String getCurrency(){
        return this.getCurrencyCode();
    }

    public Double getIOF() {
        return this.IOF;
    }
}
