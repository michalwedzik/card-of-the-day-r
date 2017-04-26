package com.notatkip.cardoftheday.logic;

public class Card {

    public enum Position {
        UPRIGHT, REVERSED
    }

    private int index;

    private String name;

    private String uprightMeaning;

    private String reversedMeaning;


    public Card(int index, String name, String uprightMeaning, String reversedMeaning) {
        this.index = index;
        this.name = name;
        this.uprightMeaning = uprightMeaning;
        this.reversedMeaning = reversedMeaning;
    }


    public int getIndex() {
        return index;
    }


    public void setIndex(int index) {
        this.index = index;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getUprightMeaning() {
        return uprightMeaning;
    }


    public void setUprightMeaning(String uprightMeaning) {
        this.uprightMeaning = uprightMeaning;
    }


    public String getReversedMeaning() {
        return reversedMeaning;
    }


    public void setReversedMeaning(String reversedMeaning) {
        this.reversedMeaning = reversedMeaning;
    }


    public Card() {
    }
}
