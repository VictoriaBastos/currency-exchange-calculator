package service.historyService;


import models.user.OutputUser;

import java.util.ArrayList;
import java.util.List;

public class HistoryServiceImpl implements HistoryService {

    private List<OutputUser> currencyExchangeHistory = new ArrayList<>();

    @Override
    public void saveCurrencyExchangeInHistory(OutputUser output) {
        this.currencyExchangeHistory.add(output);
    }

    @Override
    public List<OutputUser> getAllHistory() {
        return currencyExchangeHistory;
    }


}
