package ru.dom.ufa;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.dom.ufa.pages.EquipmentPages;
import static io.qameta.allure.Allure.step;

public class ClientEquipmentTests extends UITestBase {
    EquipmentPages EquipmentPages = new EquipmentPages();
    @Tag("EC220")
    @Description("Проверка возможности заказа роутера TP-Link Archer EC220_G5 ERT")
    @DisplayName("Assert EC220_G5 item to buy")
    @Test
    void assertBuyEC220Test() {
        step("Открыть сайт Дом.ру", () -> {
            EquipmentPages.openPage();
        });
        step("Открыть вкладку -Wifi Роутеры-", () -> {
            EquipmentPages.wifiPage();
        });
        step("Выбрать модель Маршрутизатор Wi-Fi TP-Link Archer EC220_G5 ERT", () -> {
            EquipmentPages.ec220Page();
        });
        step("Проверить, что открылась страница заказа", () -> {
            EquipmentPages.assertionsEC220();

        });
    }
    @Tag("Dir-2150")
    @Description("Проверка возможности заказа роутера D-Link DIR-2150")
    @DisplayName("Assert DIR-2150 item to buy")
    @Test
    void assertDirTest() {
        step("Открыть сайт Дом.ру", () -> {
            EquipmentPages.openPage();
        });
        step("Открыть вкладку -Wifi Роутеры-", () -> {
            EquipmentPages.wifiPage();
        });
        step("Выбрать модель Маршрутизатор Wi-Fi TP-Link Archer EC220_G5 ERT", () -> {
            EquipmentPages.dir2150Page();
        });
        step("Проверить, что открылась страница заказа", () -> {
            EquipmentPages.assertionsDIR2150();
        });
    }
    @Tag("IoT")
    @Description("Проверка возможности заказа умной колонки Яндекс")
    @DisplayName("Assert Yandex.Station item to buy")
    @Test
    void assertIOTTest() {
        step("Открыть сайт Дом.ру", () -> {
            EquipmentPages.openPage();
        });
        step("Открыть вкладку -Голосовые помощники Яндекс-", () -> {
            EquipmentPages.iotPage();
        });
        step("Выбрать модель Маршрутизатор Wi-Fi TP-Link Archer EC220_G5 ERT", () -> {
            EquipmentPages.iotOrderNumber();
        });
        step("Проверить, что открылась страница заказа", () -> {
            EquipmentPages.iotAssertion();

        });
    }
}
