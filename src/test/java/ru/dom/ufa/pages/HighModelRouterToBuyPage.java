package ru.dom.ufa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HighModelRouterToBuyPage {

    private final SelenideElement
            //locators
            webEquipment = $(By.linkText("Wi-Fi роутеры")),
            dir2150Router = $(By.linkText("D-link DIR-2150")),
            orderButton = $("[data-test='order-button']"),
            routerName = $("[data-test='router-name']"),
            orderType = $("[data-test='order-type']"),
            client = $("[type='name']"),
            phoneNumber = $("[type='tel']"),
            buttonOrder = $("[type='accent']");

    //actions
    public HighModelRouterToBuyPage openRouters() {
        webEquipment.click();
        return this;
    }

    public HighModelRouterToBuyPage chooseRouter() {
        dir2150Router.click();
        orderButton.click();
        return this;
    }

    public HighModelRouterToBuyPage routerToBuy() {
        routerName.shouldHave(Condition.text("Маршрутизатор Wi-Fi D-Link DIR-2150"));
        orderType.shouldHave(Condition.text("Рассрочка на 24 месяца"));
        client.setValue("Абонент");
        phoneNumber.setValue("+7(888)888-88-88");
        buttonOrder.shouldBe(Condition.visible);
        return this;
    }
}


