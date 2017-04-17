package com.notatkip.cardoftheday;

import javax.inject.Singleton;

import ratpack.handling.Context;
import ratpack.handling.Handler;

@Singleton
public class MyHandler implements Handler {

    @Override
    public void handle(Context context) {
        context.render("hello: " + context.getRequest().getQueryParams().get("name") + " from injected");
    }
}
