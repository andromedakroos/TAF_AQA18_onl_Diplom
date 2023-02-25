package tests.GUI.positive;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class PosTest extends BaseTest {
    @Test
    public void loginTest(){
        loginStep.loginSuccessful(userSuccessful);
    }
}
