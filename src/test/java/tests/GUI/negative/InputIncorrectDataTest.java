package tests.GUI.negative;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class InputIncorrectDataTest extends BaseTest {
    @Test(description = "Тест на использование некорректных данных")
    public void InputIncorrectDataTest(){
      loginStep.loginIncorrect(userIncorrect).shouldHave(text("Hello"));
    }
}
