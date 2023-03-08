package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TestCasesPage {
    private By attachFileButtonLocator = By.id("entityAttachmentListEmptyIcon");
    private By openLibraryButtonLocator = By.cssSelector("input[type='file']");
    private By submitAttachButtonLocator = By.className("addAttachment");
    private By attachmentNameLocator = By.xpath("//*[starts-with(@title, 'testcaselogo')]");
    private By titleInputLocator = By.id("title");
    private By addTestCaseButtonLocator = By.id("accept");

    public SelenideElement getOpenLibraryButton(){
        return $(openLibraryButtonLocator).should(exist);
    }
    public SelenideElement getAttachmentName(){
        return $(attachmentNameLocator).shouldBe(visible);
    }
    public SelenideElement getTitleInput(){
        return $(titleInputLocator).shouldBe(visible);
    }
    public SelenideElement getAddTestCaseButton(){
        return $(addTestCaseButtonLocator).shouldBe(visible);
    }
}
