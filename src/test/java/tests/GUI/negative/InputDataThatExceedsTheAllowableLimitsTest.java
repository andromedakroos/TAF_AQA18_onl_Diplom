package tests.GUI.negative;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputDataThatExceedsTheAllowableLimitsTest extends BaseTest {
    @Test
    public void InputDataThatExceedsTheAllowableLimitsTest(){
        Assert.assertTrue(loginStep.loginWithLongPassword(userWithLongPassword));
    }
}
