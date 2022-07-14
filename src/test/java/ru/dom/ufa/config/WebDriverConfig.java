package ru.dom.ufa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${type}.properties")
public interface WebDriverConfig extends Config {

    String baseURL();

    String browserName();

    String browserVersion();

    String browserSize();

    String remoteUrl();

    String videoStorage();

    int timeout();

}

//@Config.Sources("classpath:${type}.properties")