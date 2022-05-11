package ru.dom.ufa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EquipmentPages {
    String ec220 = "TP-Link EC220";
    String dir2150 = "D-link DIR-2150";
    String clientName = "Абонент";
    String clientNumber = "+7(888)888-88-88";
    String conditionEC220 = "Маршрутизатор Wi-Fi TP-Link Archer EC220_G5 ERT";
    String creditTypeEC220 = "Рассрочка на 36 месяцев";
    String conditionDIR2150 = "Маршрутизатор Wi-Fi D-Link DIR-2150";
    String creditTypeDIR2150 = "Рассрочка на 24 месяца";


    private final SelenideElement
            webEquipment = $(By.linkText("Wi-Fi роутеры")),
            ec220Router = $(By.linkText(ec220)),
            dir2150Router = $(By.linkText(dir2150)),
            orderButton = $("[data-test='order-button']"),
            routerName = $("[data-test='router-name']"),
            orderType = $("[data-test='order-type']"),
            client = $("[type='name']"),
            phoneNumber = $("[type='tel']"),
            buttonOrder = $("[type='accent']"),
            iotEquipment = $("[title='Голосовые помощники Яндекс']"),
            iotInputNumber = $("[data-test='input']"),
            iotButton = $(".sc-d47cf55-8");


    public EquipmentPages openPage() {
        open(Configuration.baseUrl);
        return this;
    }

    public EquipmentPages wifiPage() {
        webEquipment.click();
        return this;
    }

    public EquipmentPages ec220Page() {
        ec220Router.click();
        orderButton.click();
        return this;
    }

    public EquipmentPages assertionsEC220() {
        routerName.shouldHave(Condition.text(conditionEC220));
        orderType.shouldHave(Condition.text(creditTypeEC220));
        client.setValue(clientName);
        phoneNumber.setValue(clientNumber);
        buttonOrder.shouldBe(Condition.visible);
        return this;
    }

    public EquipmentPages dir2150Page() {
        dir2150Router.click();
        orderButton.click();
        return this;
    }

    public EquipmentPages assertionsDIR2150() {
        routerName.shouldHave(Condition.text(conditionDIR2150));
        orderType.shouldHave(Condition.text(creditTypeDIR2150));
        client.setValue(clientName);
        phoneNumber.setValue(clientNumber);
        buttonOrder.shouldBe(Condition.visible);
        return this;
    }
    public EquipmentPages iotPage() {
        iotEquipment.click();
        return this;
    }
    public EquipmentPages iotOrderNumber(){
        iotInputNumber.setValue("89878888888");
        return this;
    }
    public EquipmentPages iotAssertion(){
        iotButton.shouldBe(Condition.enabled);
        return this;
    }
}
