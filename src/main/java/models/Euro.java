package models;

import service.Exchangeble;

public class Euro implements Exchangeble {
    private final Double OPERATIONAL_FEE = 6.00;
    private final Double QUOTE = 0.20;
    protected final Double IOF = 1.1;

    @Override
    public User getExchangedValue(User user) {
        Double finalValue = (user.getValue() - (IOF) - (OPERATIONAL_FEE) ) * QUOTE; // alterar
        user.setFinalValue(finalValue);
        return user;
    }
}