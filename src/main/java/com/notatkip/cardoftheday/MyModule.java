package com.notatkip.cardoftheday;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {

    protected void configure() {
        bind(MyHandler.class);
    }
}