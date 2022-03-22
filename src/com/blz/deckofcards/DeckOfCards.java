package com.blz.deckofcards;

public class DeckOfCards {

    //Initialize  variables
    private static final String RANKS[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static final String SUITS [] = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final int SIZE_OF_CARDS = SUITS.length * RANKS.length;
    public static String[] deck = new String[SIZE_OF_CARDS];

    public static void initializing() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = RANKS[i % 13] + " ---> " + SUITS[i / 13];
        }
    }

    public static void display() {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);
        }
    }
}
