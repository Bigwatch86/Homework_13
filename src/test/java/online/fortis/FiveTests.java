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
    @DisplayName("Проверка открытия журнала")
    @Severity(SeverityLevel.BLOCKER)
    public void searchCheck(){
        step("Открываем журнал", () -> {
            $(".MainMenu__link a").shouldBe(visible);
            $(".MainMenu__link a").click();
            $("header div").shouldHave(text(""));
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
    @DisplayName("Проверка наличия избранного")
    @Severity(SeverityLevel.BLOCKER)
    public void searchWishlist(){
        step("Проверяем наличие избранного", () -> {
            $(".HeaderMenu__buttons_wishlist").shouldBe(visible);
            $(".HeaderMenu__buttons_wishlist").click();
            $("h2").shouldHave(text("Избранное"));

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
