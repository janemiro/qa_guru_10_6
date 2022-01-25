package allure;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class StepLambdaTest {

    private static final String REPOSITORY = "janemiro/qa_guru_10_6";
    private static final String ISSUE_NAME = "Telefffizor";

    @Test
    public void TestOfIssueName() {
        step("Open main page", () -> {
            open("https://github.com");
        });
        step("Look for repo " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys("janemiro/qa_guru_10_6");
            $(".header-search-input").submit();
        });
        step("Go into repo " + REPOSITORY, () -> {
            $(linkText("janemiro/qa_guru_10_6")).click();
        });
        step("Open tab Issues", () -> {
            $(partialLinkText("Issues")).click();
        });
        step("Check if there is an existing Issue with name" + ISSUE_NAME, () -> {
            $(withText(ISSUE_NAME)).should(Condition.visible);
        } );

    }
}
