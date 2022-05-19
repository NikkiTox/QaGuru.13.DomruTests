package ru.dom.ufa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${type}.properties")
public interface WebDriverConfig extends Config {

    @Key("baseURL")
    String baseURL();

    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("videoStorage")
    String videoStorage();

    @Key("timeout")
    int timeout();

}

//@Config.Sources("classpath:${type}.properties")