package ru.dom.ufa;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.dom.ufa.pages.RatesPages;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ClientRatesTests extends UITestBase {
    RatesPages RatesPages = new RatesPages();
    @Tag("Rates")
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
    @Tag("Address")
    @Description("Проверка доступных пакетов")
    @DisplayName("Assert complex rates")
    @Test
    void assertAddressTest() {

        step("Открыть сайт Дом.ру", () -> {
            RatesPages.openPage();
        });
        step("Нажать на кнопку с пакетными предложениями", () -> {
            $(".ibkljD").click();
            $(".Col-qyrm3i-0:nth-child(1) > .sc-dd0fac8d-2:nth-child(3) > .sc-dd0fac8d-4:nth-child(2) > .sc-dd0fac8d-5").click();
            $("*[data-test='city-item']").click();
            $("[class='dropdown__ControlDiv-sc-1xx0bws-6 cTqNtX']").$("[class=' css-140vojc-placeholder']").setValue("Дагестанская");

        });
        step("Проверить, что есть тарифы для подключения в городе Уфа", () -> {

        });
    }


}





