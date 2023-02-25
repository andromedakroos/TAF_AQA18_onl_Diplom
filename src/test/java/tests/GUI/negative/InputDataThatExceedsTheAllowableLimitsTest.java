package tests.GUI.negative;

import baseEntities.BaseTest;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class InputDataThatExceedsTheAllowableLimitsTest extends BaseTest {
    @Test
    public void InputDataThatExceedsTheAllowableLimitsTest(){
        loginStep.loginWithLongPassword(userWithLongPassword).shouldHave(text("Field Password is too long (128 characters at most)."));
    }
}
