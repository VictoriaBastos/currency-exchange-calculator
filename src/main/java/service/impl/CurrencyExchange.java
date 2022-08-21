package service.impl;

import models.User;
import service.Exchangeble;

abstract public class  CurrencyExchange implements Exchangeble {

    protected abstract Double getOperacionalFee();
    protected abstract Double getPercentageOperationalFee();
    protected abstract Double getQuote();
    protected final Double IOF = 1.1;

    private Double calculateExchange(User user) {
        Double value = user.getValue();
        return (value - IOF - (getOperacionalFee() + getPercentageOperationalFee())) * getQuote(); // alterar
    }

    public User getExchangedValue(User user) {
        Double exchangedValue = calculateExchange(user);
        user.setFinalValue(exchangedValue);
        return user;
    }
}
