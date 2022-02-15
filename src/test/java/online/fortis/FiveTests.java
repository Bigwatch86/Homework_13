package online.fortis;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class FiveTests extends TestBase{

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    @DisplayName("Проверка загрузки header")
    @Severity(SeverityLevel.BLOCKER)
    public void headerLoading() {
        step("Проверяем загрузку header", () -> {
            $(".Container").shouldBe(visible);
            $(".Container .MainHeader__logo").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    @DisplayName("Проверка работы поиска")
    @Severity(SeverityLevel.BLOCKER)
    public void searchCheck(){
        step("Проверяем работу поиска", () -> {
            $(".InputSearch__container-input").shouldBe(visible);
            $(".InputSearch__container-input").click();
            $("..InputSearch__container-input").setValue("Ноутбуки");
            $(".InputBox__icon button").click();
            $(".Subcategory__title-container h1").shouldHave(text("Ноутбуки"));
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
    @DisplayName("Проверка наличия корзины")
    @Severity(SeverityLevel.BLOCKER)
    public void searchBasket(){
        step("Проверяем наличие корзины", () -> {
            $(".HeaderMenu__buttons_basket").shouldBe(visible);
        });
    }

    @Test
    @Owner("igor.glazov")
    @Feature("Citilink")
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
    @DisplayName("Проверка загрузки каталога товаров")
    @Severity(SeverityLevel.BLOCKER)
    public void catalogLoading(){
        step("Проверяем загрузку каталога товаров", () -> {
            $("[data-label=\"Каталог товаров\"]").click();
            $(".CatalogMenu__category").shouldBe(visible);
        });
    }
}
