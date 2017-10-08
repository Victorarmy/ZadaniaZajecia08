package com.example.exerciseone;

public enum Direction {
    NORTH ("Północ"),
    SOUTH ("Południe"),
    EAST ("Wschód"),
    WEST ("Zachód"),
    UNDEFINED("Nieznany");

    private String directionInPolish;

    Direction(String directionInPolish) {
        this.directionInPolish = directionInPolish;
    }

    public static Direction convert(int number) {
        switch (number) {
            case 1:
                return NORTH;
            case 2:
                return SOUTH;
            case 3:
                return EAST;
            case 4:
                return WEST;
            default:
                return UNDEFINED;

        }
    }

    public String getDirectionInPolish() {
        return directionInPolish;
    }
}
