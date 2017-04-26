package com.notatkip.cardoftheday;

import com.notatkip.cardoftheday.logic.CardHandler;

import ratpack.guice.Guice;
import ratpack.server.RatpackServer;

public class Main {

    public static void main(String[] args) throws Exception {
        // @formatter:off
        RatpackServer.start(s -> s
            .registry(Guice.registry(b -> b.module(MyModule.class)))
            .handlers(chain -> chain             
                .path("injected", CardHandler.class)
            )
        );
        // @formatter:on
    }
}