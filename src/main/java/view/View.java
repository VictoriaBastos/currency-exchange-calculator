package view;

import exceptions.MoedaNaoExistenteException;
import exceptions.ValorNegativoException;
import models.user.InputUser;
import models.user.OutputUser;

import java.util.List;
import java.util.Scanner;

public class View {

    private Integer getInputCurrency() {

        System.out.println("\nEscolha a moeda de destino (1 - 4): ");
        System.out.println("\t1 - Euro");
        System.out.println("\t2 - Dólar");
        System.out.println("\t3 - Peso Argentino");
        System.out.println("\t4 - Peso Chileno");

        Scanner scanner = new Scanner(System.in);

        try{
            return validateInputCurrency(scanner.nextInt());
        }catch (MoedaNaoExistenteException e){
            System.out.println(e.getMessage());
            System.out.println("Escolha uma opcao valida.\n");
        }
        return getInputCurrency();
    }

    private Double getInputValue(){
        System.out.println("Digite o valor em reais (R$): ");
        Scanner scanner = new Scanner(System.in);
        try{
            return validateInputValue(scanner.nextDouble());
        }catch (ValorNegativoException e){
            System.out.println(e.getMessage());
            System.out.println("Por favor digite um valor valido.\n");
        }
        return getInputValue();
    }

    public InputUser getInput()  {
        InputUser input = new InputUser();
        input.setCurrency(getInputCurrency());
        input.setInputValue(getInputValue());
        return input;
    }

    public void showOutput(OutputUser outputUser) {
        System.out.printf("\nValor em reais:  R$ %s%n", outputUser.getStartValue());
        System.out.printf("Moeda a converter:  %s%n", outputUser.getStartCurrency());
        System.out.printf("IOF: ", outputUser.getIOF());
        System.out.printf("Taxa de operação: %s%n", outputUser.getTotalOperationFee());
        System.out.println(" —-----------------------------");
        System.out.printf("Total convertido: %s%n", outputUser.getFinalValue());
        System.out.printf("Moeda convertida: %s%n", outputUser.getFinalCurrency());
    }

    public void showExchangeHistory(List<OutputUser> history) {
        System.out.println("Voce gostaria de visualizar o historico de conversoes? 'S'/'N'");
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.next().toUpperCase();

        if ("S".equals(userResponse)) {
            System.out.println("\nHistorico de conversoes: ");
            for (OutputUser output : history) {
                showOutput(output);
            }
        }
    }

    public String continueCalculation(){
        System.out.println("\nVoce gostaria de fazer uma nova conversao? 'S'/'N' ");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next().toUpperCase();
        return result;
    };


    private Integer validateInputCurrency(Integer inputCurrency) throws MoedaNaoExistenteException {
        if (inputCurrency < 1 || inputCurrency > 4) {
            throw new MoedaNaoExistenteException("A opcao escolhida esta indisponivel para conversao");
        }
        return inputCurrency;
    }

    private Double validateInputValue(Double inputValue) throws ValorNegativoException {
        if (inputValue < 0) {
            throw new ValorNegativoException("O valor a ser convertido deve ser maior que zero.");
        }
        return inputValue;
    }
}
