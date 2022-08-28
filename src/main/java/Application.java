import factory.CurrencyExchangeFactory;
import models.user.InputUser;
import models.user.OutputUser;
import service.orchestrator.CurrencyExchangeService;
import service.orchestrator.impl.CurrencyExchangeServiceImpl;
import service.historyService.HistoryService;
import service.historyService.HistoryServiceImpl;
import view.View;

import java.util.List;

public class Application {
    public static void main(String[] args){
        System.out.println("Iniciando Currency Exchange Calculator");

        // Initialize classes.
        View view = new View();
        HistoryService historyService = new HistoryServiceImpl();
        CurrencyExchangeService currencyExchangeService = new CurrencyExchangeServiceImpl(new CurrencyExchangeFactory());

        String repeat = "S";
        while("S".equals(repeat)){
            // Get User Input
            InputUser userInput = view.getInput();

            // Currency service - orchestrate and calculate exchanged value
            OutputUser userOutput = currencyExchangeService.getExchangeOutput(userInput);

            // Save Service in History
            historyService.saveCurrencyExchangeInHistory(userOutput);

            // Show output in the console
            view.showOutput(userOutput);

            //Continue or Interrupt loop
            repeat = view.continueCalculation();
        }

        //Get history of operations
        List<OutputUser> history = historyService.getAllHistory();

        // Show in the console historic of exchanges
        view.showExchangeHistory(history);

    }
}
