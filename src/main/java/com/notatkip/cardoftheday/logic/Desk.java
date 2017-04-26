package com.notatkip.cardoftheday.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;

public class Desk {

    private List<Card> cards = new ArrayList<Card>();


    public Desk() {
        cards = createDesk();
    }


    private List<Card> createDesk() {
        List<Card> localCards = new ArrayList<Card>();
        for (int i = 1; i <= 78; i++) {
            localCards.add(new Card(i, "", "", ""));
        }
        return localCards;
    }


    public void shuffle() {
        Collections.shuffle(cards);
    }


    public void shuffleSecondMethod() {
        shuffleArray(cards);
    }


    private void shuffleArray(List<Card> ar) {

        Random rnd = new Random();
        for (int i = ar.size() - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card card = ar.get(index);
            ar.set(index, ar.get(i));
            ar.set(i, card);
        }
    }


    public String indexesOfCards() {
        StringJoiner sj = new StringJoiner(",");
        cards.forEach(c -> sj.add(String.valueOf(c.getIndex())));
        return sj.toString();
    }


    public int size() {
        return cards.size();
    }


    public Card getCard(int numberOfCard) {
        return cards.get(numberOfCard);
    }
}
