package ru.dom.ufa;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import helpers.AllureAttachments;
import helpers.DriverConfig;
import ru.dom.ufa.pages.HighModelRouterToBuyPage;
import ru.dom.ufa.pages.IotStationOrderPage;
import ru.dom.ufa.pages.LowModelRouterToBuyPage;
import ru.dom.ufa.pages.RatesPages;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    LowModelRouterToBuyPage lowModel = new LowModelRouterToBuyPage();
    HighModelRouterToBuyPage highModel = new HighModelRouterToBuyPage();
    IotStationOrderPage iotEquipment = new IotStationOrderPage();
    RatesPages ratesPages = new RatesPages();

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("Allure", new AllureSelenide());
        DriverConfig.configure();
    }

    @AfterEach
    void addAttachments() {
        AllureAttachments.screenshotAs("Скриншот");
        AllureAttachments.pageSource();
        AllureAttachments.browserConsoleLogs();
        AllureAttachments.addVideo();
        closeWebDriver();
    }
}

