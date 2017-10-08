package com.example.exercisefour.View;

public enum Coin {
    GR1(1, "GR", 0.01),
    GR2(2, "GR", 0.01),
    GR5(5, "GR", 0.01),
    GR10(10, "GR", 0.01),
    GR20(20, "GR", 0.01),
    GR50(50, "GR", 0.01),
    ZL1(1, "ZL", 1),
    ZL2(2, "ZL", 1),
    ZL5(5, "ZL", 1),
    ZL10(10, "ZL", 1),
    ZL20(20, "ZL", 1),
    ZL50(50, "ZL", 1),
    ZL100(100, "ZL", 1),
    ZL200(200, "ZL", 1),
    ZL500(500, "ZL", 1);

    private int coinValue;
    private String coinPostfix;
    private double coinDivider;

    Coin(int coinValue, String coinPostfix, double coinDivider) {
        this.coinValue = coinValue;
        this.coinPostfix = coinPostfix;
        this.coinDivider = coinDivider;
    }

    public static Coin getCoin(String coin) {
        switch (coin) {
            case "1GR":
                return GR1;
            case "2GR":
                return GR2;
            case "5GR":
                return GR5;
            case "10GR":
                return GR10;
            case "20GR":
                return GR20;
            case "50GR":
                return GR50;
            case "1ZL":
                return ZL1;
            case "2ZL":
                return ZL2;
            case "5ZL":
                return ZL5;
            case "10ZL":
                return ZL10;
            case "20ZL":
                return ZL20;
            case "50ZL":
                return ZL50;
            case "100ZL":
                return ZL100;
            case "200ZL":
                return ZL200;
            case "500ZL":
                return ZL500;
            default:
                return null;
        }
    }

    public int getCoinValue() {
        return coinValue;
    }

    public String getCoinPostfix() {
        return coinPostfix;
    }

    public double getCoinDivider() {
        return coinDivider;
    }
}
