package allure;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.LogEventListener;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {


    @Test
    public void TestOfIssueName() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("janemiro/qa_guru_10_6");
        $(".header-search-input").submit();

        $(linkText("janemiro/qa_guru_10_6")).click();
        $(partialLinkText("Issues")).click();
        $(withText("Televiffffzor")).should(Condition.visible);
    }
}
