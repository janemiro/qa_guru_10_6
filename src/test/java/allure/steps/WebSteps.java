package allure.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class WebSteps {
    @Step("Open main page")
    public void openUrl() {
        open("https://github.com");
    }

    @Step("Look for repo {repository}")
    public void searchForRepo(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }

    @Step("Go into repo {repository}")
    public void goToRepo(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Open tab Issues")
    public void openIssueTab() {
        $(partialLinkText("Issues")).click();
    }

    @Step("Check if there is an existing Issue with name {issueName}")
    public void shouldSeeIssueWithName(String issueName) {
        $(withText(issueName)).should(Condition.visible);
    }
}
