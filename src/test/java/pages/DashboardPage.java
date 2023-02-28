package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage{
    private By addProjectButtonLocator = By.id("sidebar-projects-add");
    private By projectsLogoLocator = By.className("top");
    public SelenideElement getAddProjectButton(){
        return $(addProjectButtonLocator).shouldBe(visible);
    }
    public SelenideElement getProjectsLogo(){
        return $(projectsLogoLocator).shouldBe(visible);
    }
}
