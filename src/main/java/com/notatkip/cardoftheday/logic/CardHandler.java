package com.notatkip.cardoftheday.logic;

import javax.inject.Singleton;

import ratpack.handling.Context;
import ratpack.handling.Handler;

@Singleton
public class CardHandler implements Handler {

    @Override
    public void handle(Context context) {
        int numberOfCard = new Integer(context.getRequest().getQueryParams().get("number"));

        Desk desk = new Desk();
        desk.shuffle();
        desk.shuffleSecondMethod();
        Card card = desk.getCard(numberOfCard);

        context.render("hello " + context.getRequest().getQueryParams().get("name") + ", your card of the day is " + card.getIndex() + " (" + desk.size() + ")");
    }

}
