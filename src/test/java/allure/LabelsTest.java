package allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {


    @Test
    @Link(name = "GitHub", url = "https://github.com")
    @Owner("janemiro")
    @Feature("Search")
    @Story("Sunny case search")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("My Test")
    public void testLambda() {
    }


    @Test
    public void testAnnotated() {

    }

}
