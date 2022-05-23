package ru.dom.ufa.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RatesPages {

    //locator
    private final SelenideElement

            ratesArchive = $(By.linkText("ТВ + Интернет")),
            ratesTitle = $("[class='sc-6dc94116-2 kFdYWj']"),
            cityButton = $(".ibkljD"),
            stateButton = $(".Col-qyrm3i-0:nth-child(1) > .sc-dd0fac8d-2:nth-child(3) > .sc-dd0fac8d-4:nth-child(2) > .sc-dd0fac8d-5"),
            cityChoose = $("*[data-test='city-item']"),
            streetField = $(".iLlchu [type='text']"),
            buildField = $(".cTqNtX [type='text']"),
            flatField = $("name='flat'"),
            confirmAddressButton = $("type='accent'"),
            assertAddressField = $("class='sc-193e5f56-8 hyAlhJ'");

    //actions
    public RatesPages openPage() {
        open("baseURL");
        return this;
    }

    public RatesPages ratesArchives() {
        ratesArchive.click();
        return this;
    }

    public RatesPages assertTitle() {
        ratesTitle.shouldHave(Condition.text("Выберите интернет и цифровое ТВ в Уфе"));
        return this;
    }
    public RatesPages valueAddress (){
        cityButton.click();
        stateButton.click();
        cityChoose.click();
        streetField.setValue("Дагестанская").pressEnter();
        buildField.setValue("14").pressEnter();
        flatField.setValue("1");
        confirmAddressButton.click();
        return this;
    }
    public RatesPages assertAddress(){
        assertAddressField.shouldHave(Condition.text("Услуги можно подключить"));
        return this;
    }
}

