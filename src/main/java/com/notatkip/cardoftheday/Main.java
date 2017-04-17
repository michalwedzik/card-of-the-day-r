package com.notatkip.cardoftheday;

import ratpack.guice.Guice;
import ratpack.server.RatpackServer;

public class Main {

    public static void main(String[] args) throws Exception {
        // @formatter:off
        RatpackServer.start(s -> s
            .registry(Guice.registry(b -> b.module(MyModule.class)))
            .handlers(chain -> chain             
                .path("from-param", ctx -> ctx.render("Hello " + ctx.getRequest().getQueryParams().get("name") + "!"))
                .path("injected", MyHandler.class)
            )
        );
        // @formatter:on
    }
}