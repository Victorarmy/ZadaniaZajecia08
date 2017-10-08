package com.example.exercisefour.Computate;

import com.example.exercisefour.View.Coin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ExchangeCalculator {

    private double bill;
    private double alreadyPaid;
    private Random random;
    private double exchange;

    public ExchangeCalculator() {
        random = new Random();
        bill = getRoundedNumber(random.nextDouble() * 500);
        alreadyPaid = 0.00;
    }

    public double getAlreadyPaid() {
        return alreadyPaid;
    }

    public double getBill() {
        return bill;
    }

    public void pay(Coin coin) {
        alreadyPaid = getRoundedNumber(alreadyPaid + getRoundedNumber(coin.getCoinValue() * coin.getCoinDivider()));
    }

    public double generateExchange() {
        exchange = getRoundedNumber(alreadyPaid - bill);
        return exchange;
    }

    public Coin[] generateCoinsForExchange(double exchange) {
        ArrayList<Coin> listOfCoins = new ArrayList<>();
        Coin[] coins = Coin.values();
        int index = coins.length - 1;
        while (exchange > 0 && index > -1) {
            Coin coin = coins[index];
            if (exchange - (coin.getCoinValue() * coin.getCoinDivider()) >= 0) {
                exchange = exchange - (coin.getCoinValue() * coin.getCoinDivider());
                listOfCoins.add(coin);
            } else {
                index--;
            }
        }
        Coin[] resultArray = new Coin[listOfCoins.size()];
        return listOfCoins.toArray(resultArray);
    }

    private double getRoundedNumber(double number) {
        return Math.round(number * 100) / 100D;
    }

    public boolean isThereAnyExhange() {
        return alreadyPaid > bill;
    }
}
