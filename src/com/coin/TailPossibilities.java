package com.coin;

public class TailPossibilities {
    private final int numberOftails;
    private final int totalSides;

    public TailPossibilities(int numberOftails, int totalSides) {
        this.numberOftails = numberOftails;
        this.totalSides = totalSides;
    }

    public int getChanceOfTails(int numberOfCoins) {
        return numberOftails * numberOfCoins;
    }

    public int getChancesOfNotTails() {
        return totalSides - numberOftails;
    }
}
