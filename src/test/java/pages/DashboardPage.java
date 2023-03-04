package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage{
    private By addProjectButtonLocator = By.id("sidebar-projects-add");
    private By projectNameLocator = By.xpath("//*[text() = 'TestProject']");
    private By administrationButtonLocator = By.id("navigation-admin");
    public SelenideElement getAddProjectButton(){
        return $(addProjectButtonLocator).shouldBe(visible);
    }

    public SelenideElement getProjectName(){
        return $(projectNameLocator).shouldBe(visible);
    }

    public SelenideElement getAdministrationButton(){
        return $(administrationButtonLocator).shouldBe(visible);
    }
}
