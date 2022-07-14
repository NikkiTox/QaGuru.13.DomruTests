package ru.dom.ufa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LowModelRouterToBuyPage {


    private final SelenideElement
            //locators
            webEquipment = $(By.linkText("Wi-Fi роутеры")),
            ec220Router = $(By.linkText("TP-Link EC220")),
            orderButton = $("[data-test='order-button']"),
            routerName = $("[data-test='router-name']"),
            orderType = $("[data-test='order-type']"),
            client = $("[type='name']"),
            phoneNumber = $("[type='tel']"),
            buttonOrder = $("[type='accent']");

    //actions
    public LowModelRouterToBuyPage openRouters() {
        webEquipment.click();
        return this;
    }

    public LowModelRouterToBuyPage chooseRouter() {
        ec220Router.click();
        orderButton.click();
        return this;
    }

    public LowModelRouterToBuyPage routerToBuy() {
        routerName.shouldHave(Condition.text("Маршрутизатор Wi-Fi TP-Link Archer EC220_G5 ERT"));
        orderType.shouldHave(Condition.text("Рассрочка на 36 месяцев"));
        client.setValue("Абонент");
        phoneNumber.setValue("+7(888)888-88-88");
        buttonOrder.shouldBe(Condition.visible);
        return this;
    }
}
