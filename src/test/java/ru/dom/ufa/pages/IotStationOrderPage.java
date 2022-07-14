package ru.dom.ufa.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class IotStationOrderPage {

    private final SelenideElement
            //locators
            iotEquipment = $("[title='Голосовые помощники Яндекс']"),
            iotInputNumber = $("[data-test='input']"),
            iotButton = $(".sc-d47cf55-8");

    //actions
    public IotStationOrderPage openVoiceAssistants() {
        iotEquipment.click();
        return this;
    }

    public IotStationOrderPage setIotOrderNumber() {
        iotInputNumber.setValue("+7(888)888-88-88");
        return this;
    }

    public IotStationOrderPage orderIotStation() {
        iotButton.shouldBe(Condition.enabled);
        return this;
    }
}
