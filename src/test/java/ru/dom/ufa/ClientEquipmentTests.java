package ru.dom.ufa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class ClientEquipmentTests extends TestBase {

    @Test
    @DisplayName("Assert EC220_G5 item to buy")
    void assertBuyEC220Test() {
        step("Открыть сайт Дом.ру", () -> {
            open(Configuration.baseUrl);
        });
        step("Открыть вкладку 'Wifi Роутеры'", () -> {
            lowModel.openRouters();
        });
        step("Выбрать модель Маршрутизатор Wi-Fi TP-Link Archer EC220_G5 ERT", () -> {
            lowModel.chooseRouter();
        });
        step("Проверить, что открылась страница покупки", () -> {
            lowModel.routerToBuy();
        });
    }

    @Test
    @DisplayName("Assert DIR-2150 item to buy")
    void assertDirTest() {
        step("Открыть сайт Дом.ру", () -> {
            open(Configuration.baseUrl);
        });
        step("Открыть вкладку 'Wifi Роутеры'", () -> {
            highModel.openRouters();
        });
        step("Выбрать модель Маршрутизатор Wi-Fi D-Link DIR - 2150", () -> {
            highModel.chooseRouter();
        });
        step("Проверить, что открылась страница покупки", () -> {
            highModel.routerToBuy();
        });
    }

    @Test
    @DisplayName("Assert Yandex.Station item to buy")
    void assertIOTTest() {
        step("Открыть сайт Дом.ру", () -> {
            open(Configuration.baseUrl);
        });
        step("Открыть вкладку 'Голосовые помощники Яндекс'", () -> {
            iotEquipment.openVoiceAssistants();
        });
        step("Ввести данные для заказа умной колонки", () -> {
            iotEquipment.setIotOrderNumber();
        });
        step("Проверить, что есть возможность заказа умной колонки", () -> {
            iotEquipment.orderIotStation();
        });
    }
}