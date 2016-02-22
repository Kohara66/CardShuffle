package com.happy;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Random rng = new Random();
        int playCard = rng.nextInt(52);
        int count = 0;
        ArrayList<String> deck = new ArrayList<>();
        String[] suits = {"SPADES", "HEARTS", "DIAMONDS", "CLUBS"};
        String[] card = {"Ace", "2", "3", "4", "5", "6", "7", "8","9", "10", "JACK", "QUEEN", "KING"};
        for (int i = 0; i <suits.length; i++ ) {
            for (int c = 0; c < card.length; c++) {
                deck.add(card[c] + " of " + suits[i]);
                count++;
            }
        }

        System.out.println(deck);
        System.out.println(deck.get(playCard));


    }

}



