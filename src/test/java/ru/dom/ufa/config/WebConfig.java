package ru.dom.ufa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:local.properties")
public interface WebConfig extends Config {

    @Key("browserNameChose")
    String browserNameChose();

    @Key("browserVersion")
    String browserVersion();

    @Key("browserSize")
    String browserSize();

    @Key("remoteUrl")
    String remoteUrl();
}

//@Config.Sources("classpath:${launch}.properties")