package allure;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParametersTest {
    @DisplayName("Check of")
    @ParameterizedTest(name = "{displayName} {0}")
    @ValueSource(strings = {"Los Angeles", "Berlin"})
    public void testLambda(String city) {
        Allure.parameter("City", city);
    }

}
