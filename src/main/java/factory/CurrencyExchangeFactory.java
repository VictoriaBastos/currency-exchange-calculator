package factory;

import models.currency.ArgentinePeso;
import models.currency.ChileanPeso;
import models.currency.Dollar;
import models.currency.Euro;
import models.user.InputUser;
import service.exchangeService.CurrencyExchangeImpl;
import java.util.Map;

public class CurrencyExchangeFactory {

    private final Map<Integer, CurrencyExchangeImpl> currency = Map.of(
            1, new Euro(),
            2, new Dollar(),
            3, new ArgentinePeso(),
            4, new ChileanPeso()
    );

    public CurrencyExchangeImpl getCurrency(InputUser inputUser) {
        Integer currencyInput = inputUser.getCurrency();
        return this.currency.get(currencyInput);
    }
}