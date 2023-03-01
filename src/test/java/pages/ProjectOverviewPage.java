package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProjectOverviewPage {
    private By successfulMessageLocator = By.className("message-success");

    public SelenideElement getSuccessfulMessage(){
        return $(successfulMessageLocator).shouldBe(visible);
    }
}
