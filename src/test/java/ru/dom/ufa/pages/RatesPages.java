package ru.dom.ufa.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RatesPages {

    //locator
    private final SelenideElement

            ratesArchive = $(By.linkText("ТВ + Интернет")),
            ratesTitle = $("[id='bundles_title']"),
            emptyField = $(".sc-cecf6fda-0");


    //actions
    public RatesPages openPage() {
        open(Configuration.baseUrl);
        return this;
    }

    public RatesPages ratesArchives() {
        ratesArchive.click();
        emptyField.click();
        return this;
    }

    public RatesPages assertTitle() {
        ratesTitle.shouldHave(Condition.text("Выберите интернет и цифровое ТВ в Уфе"));
        return this;
    }

}

