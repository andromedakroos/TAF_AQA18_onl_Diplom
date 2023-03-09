package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProjectOverviewPage {
    private By successfulMessageLocator = By.className("message-success");
    private By dashboardButtonLocator = By.id("navigation-dashboard");
//    private By projectNameLocator = By.xpath("//a[text() = 'TestProject']/ancestor::tr//a[@href = 'javascript:void(0)']");
    private By deleteButtonLocator = By.xpath("//a[text() = 'TestProject']/ancestor::tr//div[@class = 'icon-small-delete']");
//    private By checkBoxLocator = By.xpath("//input[@type ='checkbox']");
    private By checkBoxLocator = By.className("checkbox");
    private By OKButtonLocator = By.xpath("//a[text() = 'OK']");
    public SelenideElement getSuccessfulMessage(){
        return $(successfulMessageLocator).shouldBe(visible);
    }
    public SelenideElement getDashboardButton(){
        return $(dashboardButtonLocator).shouldBe(visible);
    }
    public SelenideElement getDeleteButton(){
        return $(deleteButtonLocator).shouldBe(visible);
    }
    public SelenideElement getCheckbox(){
        return $(checkBoxLocator).should(exist);
    }
    public SelenideElement getOKButton(){
        return $(OKButtonLocator).shouldBe(visible);
    }
}
