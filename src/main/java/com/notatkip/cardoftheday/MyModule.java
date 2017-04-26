package com.notatkip.cardoftheday;

import com.google.inject.AbstractModule;
import com.notatkip.cardoftheday.logic.CardHandler;

public class MyModule extends AbstractModule {

    protected void configure() {
        bind(CardHandler.class);
    }
}