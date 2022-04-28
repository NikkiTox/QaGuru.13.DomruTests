package ru.dom.ufa;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class DomruTests extends TestBase {
    @Test
    @Description("Проверка возможности подключения по адресу")
    @DisplayName("Assert connection address")
    void assertPossibilityTest() {
        step("Открыть сайт Дом.ру", ()->{
            open(Configuration.baseUrl);
        });
        step ("Ввести адрес подключения и нажать на проверку", ()->{
            $("class='styled__Button-sc-1o7dcgr-0 ibkljD sc-193e5f56-24 jOIKPh'").click();
            $("class='dropdown__ControlDiv-sc-1xx0bws-6 cTqNtX'").click();
            $("class='dropdown__ControlDiv-sc-1xx0bws-6 cTqNtX'").setValue("Уфа").pressEnter();
        });
    }



}
