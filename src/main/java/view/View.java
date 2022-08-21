package view;

import models.User;

import java.util.Scanner;

public class View {

    public User getUserInput(){
        return new User(getValue(), getCurrency());
    }

    private Double getValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite o valor a ser convertido:");
        Double valor =  scanner.nextDouble();
        System.out.println(valor);
        return valor;
    }

    private String getCurrency(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite a moeda para qual gostaria de efetuar a conversao:");
        String currency = scanner.nextLine();
        System.out.println(currency);
        return currency;
    }
}
