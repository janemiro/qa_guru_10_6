package allure;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;


public class ParametersTest {
    @Disabled
    @DisplayName("Check of")
   // @ParameterizedTest(name = "{displayName} {0}")
    //@ValueSource(strings = {"L.A.", "Hamburg"})
    public void testLambda(String city) {
        Allure.parameter("City", city);
    }

}
