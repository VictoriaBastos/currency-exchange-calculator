package factory;

import models.*;
import service.Exchangeble;

import java.util.Map;

public class CurrencyExchangeFactory {

    private final Map<String, Exchangeble> currency = Map.of(
            "dolar", new Dollar(),
            "euro", new Euro(),
            "peso argentino", new ArgentinePeso(),
            "peso chileno", new ChileanPeso()
    );

    public Exchangeble getCurrency(User user) {
        String currencyInput = user.getCurrency();
        return this.currency.get(currencyInput);
    }
}