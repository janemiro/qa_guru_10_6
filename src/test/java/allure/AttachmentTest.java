package allure;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AttachmentTest {

    private static final String REPOSITORY = "janemiro/qa_guru_10_6";

    @Test
    public void TestLambda() {
        AllureLifecycle lifecycle = Allure.getLifecycle();

        step("Open main page", () -> {
            open("https://github.com");
        });

        step("Look for repo " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys("janemiro/qa_guru_10_6");
            $(".header-search-input").submit();
            lifecycle.addAttachment("Screenshot", "image/png", "png", takeScreenshot());
        });
    }

private byte[] takeScreenshot(){
    final WebDriver driver = WebDriverRunner.getWebDriver();
    return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

    }
}
