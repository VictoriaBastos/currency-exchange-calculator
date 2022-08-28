package service.orchestrator;

import models.user.InputUser;
import models.user.OutputUser;

public interface CurrencyExchangeService {
    public OutputUser getExchangeOutput(InputUser inputUser);
}
