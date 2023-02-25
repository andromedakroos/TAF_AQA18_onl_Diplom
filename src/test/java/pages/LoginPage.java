package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private By usernameLocator = By.id("name");
    private By passwordLocator = By.id("password");
    private By loginButtonLocator = By.id("button_primary");


    public SelenideElement getUsernameInput() {
        return $(usernameLocator).shouldBe(visible);
    }
    public SelenideElement getPasswordInput() {
        return $(passwordLocator).shouldBe(visible);
    }
    public SelenideElement getLoginButton() {
        return $(loginButtonLocator).shouldBe(visible);
    }
}
