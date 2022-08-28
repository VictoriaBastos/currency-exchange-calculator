package service.historyService;

import models.user.OutputUser;

import java.util.List;

public interface HistoryService {
    void saveCurrencyExchangeInHistory(OutputUser inputOutput);

    List<OutputUser> getAllHistory();
}
