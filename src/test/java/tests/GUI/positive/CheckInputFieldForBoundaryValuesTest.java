package tests.GUI.positive;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class CheckInputFieldForBoundaryValuesTest extends BaseTest {
    @Test
    public void checkInputFieldForBoundaryValuesTest(){
        loginStep.loginWithShortPassword(userWithShortPassword);
        loginStep.clearPasswordField();
        loginStep.loginWithLongPassword(userWithLongPassword);
        loginStep.clearPasswordField();
        loginStep.loginSuccessful(userSuccessful);
        //проверка что открылся дашборд
    }
}
