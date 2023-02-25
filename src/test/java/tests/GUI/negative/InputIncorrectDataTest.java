package tests.GUI.negative;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputIncorrectDataTest extends BaseTest {
    @Test
    public void InputIncorrectDataTest(){
        Assert.assertTrue(loginStep.loginIncorrect(userIncorrect));
    }
}
