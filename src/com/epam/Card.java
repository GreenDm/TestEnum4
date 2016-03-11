package com.epam;

/**
 * Created by Hrinchenko on 12.03.2016.
 */
public class Card {

    private Suit cardSuit;
    private Rank cardRank;

    public Card(Rank cardRank, Suit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    @Override
    public String toString() {
        return "The Card: " +
                 cardRank + "_" +
                 cardSuit;
    }
}
