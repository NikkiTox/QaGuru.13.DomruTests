package ru.dom.ufa;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.dom.ufa.pages.RatesPages;

import static io.qameta.allure.Allure.step;

public class ClientRatesTests extends UITestBase {
    RatesPages RatesPages = new RatesPages();

    @Description("Проверка доступных пакетов")
    @DisplayName("Assert complex rates")
    @Test
    void assertRatesTest() {

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


}





