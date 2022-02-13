package online.fortis;

import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class FiveTests extends TestBase{

    @BeforeEach
    void openPage(){
        step("Открываем страницу", () -> {
            open("https://www.citilink.ru/");
        });
    }

    @AfterEach
    void closePage() {
        closeWebDriver();
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    //@Story("Проверка загрузки")
    @DisplayName("Проверка загрузки header")
    @Severity(SeverityLevel.BLOCKER)
    public void headerLoading() {
        step("Проверяем загрузку header", () -> {
            $(".MainLayout__header").shouldBe(visible);
            $(".MainLayout__header placeholder").shouldHave(text("Поиск по товарам"));
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    //@Story("Проверка загрузки")
    @DisplayName("Проверка работы поиска")
    @Severity(SeverityLevel.BLOCKER)
    public void searchCheck(){
        step("Проверяем работу поиска", () -> {
            $(".InputBox__input").setValue("Ноутбуки").pressEnter();
            $(".Container").shouldHave(text("Ноутбуки"));
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    //@Story("Проверка загрузки")
    @DisplayName("Проверка наличия корзины")
    @Severity(SeverityLevel.BLOCKER)
    public void searchBasket(){
        step("Проверяем наличие корзины", () -> {
            $("HeaderMenu__buttons  HeaderMenu__buttons_basket").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    //@Story("Проверка загрузки")
    @DisplayName("Проверка наличия каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogIsVisible(){
        step("Проверяем наличие каталога товаров", () -> {
            $("[data-label=\"Каталог товаров\"]").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    //@Story("Проверка загрузки")
    @DisplayName("Проверка загрузки каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogLoading(){
        step("Проверяем загрузку каталога товаров", () -> {
            $(".CatalogMenu__left span").shouldHave(text("Каталог"));
        });
    }
}
