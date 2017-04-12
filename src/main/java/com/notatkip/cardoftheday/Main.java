package com.notatkip.cardoftheday;

import ratpack.server.RatpackServer;

public class Main {

    public static void main(String[] args) throws Exception {
        // @formatter:off
        RatpackServer.start(s -> s
            .handlers(chain -> chain             
                .get(":name", ctx -> ctx.render("Hello " + ctx.getPathTokens().get("name") + "!")) 
            )
        );
        // @formatter:on
    }
}