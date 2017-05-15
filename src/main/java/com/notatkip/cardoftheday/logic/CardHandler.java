package com.notatkip.cardoftheday.logic;

import static ratpack.jackson.Jackson.json;

import javax.inject.Singleton;

import ratpack.handling.Context;
import ratpack.handling.Handler;

@Singleton
public class CardHandler implements Handler {

    private Desk desk = new Desk();


    @Override
    public void handle(Context context) {
        int numberOfCard = new Integer(context.getRequest().getQueryParams().get("number"));

        desk.shuffleDesk();
        desk.shuffleDeskSecondMethod();

        context.render(json(desk.getCard(numberOfCard)));
    }

}
