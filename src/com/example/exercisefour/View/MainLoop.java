package com.example.exercisefour.View;

import com.example.exercisefour.Computate.ExchangeCalculator;
import com.example.exercisefour.UserInputUtils.UserInput;

public class MainLoop {

    private ExchangeCalculator exchangeCalculator;
    private UserInput userInput;

    public MainLoop() {
        exchangeCalculator = new ExchangeCalculator();
        userInput = new UserInput();
    }

    public void start() {
        System.out.println("Do zapłaty: " + exchangeCalculator.getBill());
        System.out.println("Dostępne nominały:");
        showAllCoins();
        System.out.println("Wrzuć banknot lub monetę: ");
        letTheUserPay();

        if (exchangeCalculator.isThereAnyExhange()) {
            showExchangeCoins();
        }

        userInput.closeScanner();
    }

    private void showExchangeCoins() {
        double exchange = exchangeCalculator.generateExchange();
        System.out.println("Reszta: " + exchange);
        Coin[] coins = exchangeCalculator.generateCoinsForExchange(exchange);
        System.out.println("Odbierz banknoty i monety");
        showCoins(coins);
    }

    private void letTheUserPay() {
        while ((exchangeCalculator.getAlreadyPaid()) < exchangeCalculator.getBill()) {
            String userCoin = userInput.newLine();
            Coin coin = Coin.getCoin(userCoin);
            while (coin == null) {
                System.out.println("Moneta lub banknot nieznany");
                System.out.println("Pozostało do zapłaty " + (exchangeCalculator.getBill() - exchangeCalculator.getAlreadyPaid()));
                System.out.println("Wrzuć banknot lub monetę: ");
                userCoin = userInput.newLine();
                coin = Coin.getCoin(userCoin);
            }
            exchangeCalculator.pay(coin);
        }
    }

    private void showCoins(Coin[] coins) {
        for (Coin coin : coins) {
            System.out.print(coin.getCoinValue() + coin.getCoinPostfix() + " ");
        }
    }
    private void showAllCoins() {
        showCoins(Coin.values());
        System.out.println();
    }
}
