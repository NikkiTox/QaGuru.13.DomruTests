package ru.dom.ufa;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ru.dom.ufa.pages.RatesPages;

import static io.qameta.allure.Allure.step;

public class ClientRatesTests extends TestBase {
    RatesPages RatesPages = new RatesPages();
    @Disabled
    @Description("Проверка доступных пакетов")
    @DisplayName("Assert bundle rates")
    @Test
    void assertBundleTest() {

        step("Открыть сайт Дом.ру", () -> {
            RatesPages.openPage();
        });
        step("Нажать на кнопку с пакетными предложениями", () -> {
            RatesPages.ratesArchives();
        });
        step("Проверить, что есть тарифы для подключения в городе Уфа", () -> {
            RatesPages.assertTitle();
        });
    }
    @Disabled
    @Description("Проверка адреса подключения")
    @DisplayName("Assert address connection")
    @Test
    void assertAddressTest() {

        step("Открыть сайт Дом.ру", () -> {
            RatesPages.openPage();
        });
        step("Выбрать адрес подключения", () -> {
            RatesPages.valueAddress();
        });
        step("Проверить, что есть тарифы для подключения в городе Уфа", () -> {
            RatesPages.assertAddress();
        });
    }


}





