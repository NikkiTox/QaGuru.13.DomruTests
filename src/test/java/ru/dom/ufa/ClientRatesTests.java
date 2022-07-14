package ru.dom.ufa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class ClientRatesTests extends TestBase {

    @Test
    @DisplayName("Assert title")
    void assertTitleTest() {
        step("Открыть сайт Дом.ру", () -> {
            ratesPages.openPage();
        });
        step("Проверить заголовок страницы", () -> {
            ratesPages.assertTitle();
        });
    }

    @Test
    @DisplayName("Assert bundle rates")
    void assertBundleTest() {
        step("Открыть сайт Дом.ру", () -> {
            ratesPages.openPage();
        });
        step("Нажать на кнопку с пакетными предложениями", () -> {
            ratesPages.ratesArchives();
        });
        step("Проверить, что есть тарифы для подключения в городе Уфа", () -> {
            ratesPages.assertText();
        });
    }

    @Test
    @DisplayName("Assert address connection")
    void assertAddressTest() {
        step("Открыть сайт Дом.ру", () -> {
            ratesPages.openPage();
        });
        step("Выбрать адрес подключения", () -> {
            ratesPages.valueAddress();
        });
        step("Проверить, что есть тарифы для подключения в городе Уфа", () -> {
            ratesPages.assertAddress();
        });
    }
}