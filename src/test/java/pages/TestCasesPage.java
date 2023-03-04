package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TestCasesPage {
    private By attachFileButtonLocator = By.id("entityAttachmentListEmptyIcon");
//    private By openLibraryButtonLocator = By.className("dz-hidden-input"); работающий вариант
private By openLibraryButtonLocator = By.id("libraryAddAttachment");
    private By submitAttachButtonLocator = By.className("addAttachment");
    private By imageSubmitButtonLocator = By.className("attachment-selection");
    private By attachmentNameLocator = By.xpath("//*[@title ='testcaselogo.png'");

    public SelenideElement getSubmitAttachButton(){
        return $(submitAttachButtonLocator).shouldBe(visible);
    }
    public SelenideElement getAttachFileButton(){
        return $(attachFileButtonLocator).shouldBe(visible);
    }
    public SelenideElement getOpenLibraryButton(){
        return $(openLibraryButtonLocator).should(exist);
    }
    public SelenideElement getAttachmentName(){
        return $(attachmentNameLocator).shouldBe(visible);
    }
    public SelenideElement getImageSubmitButton(){
        return $(imageSubmitButtonLocator).should(exist);
    }
}