package baseEntities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import configuration.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import models.User;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import steps.LoginStep;
import utils.InvokedListener;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
@Listeners(InvokedListener.class)
public class BaseTest {
    protected LoginStep loginStep;
    protected User userSuccessful;
    protected User userIncorrect;
    protected User userWithLongPassword;
    protected User userWithShortPassword;
    @BeforeSuite
    public void setUp(ITestContext iTestContext) {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        iTestContext.setAttribute("driver", driver);
        Configuration.browser = ReadProperties.browserName();
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 15000;
        Configuration.fastSetValue = true;
        loginStep = new LoginStep();
        userSuccessful = User.builder()
                .name(ReadProperties.username())
                .password(ReadProperties.password())
                .build();
        userIncorrect = User.builder()
                .name("andrewmrz@gmail.com")
                .password("Qwerty_123456789")
                .build();
        userWithLongPassword = User.builder()
                .name(ReadProperties.username())
                .password(ReadProperties.longPassword())
                .build();
        userWithShortPassword = User.builder()
                .name(ReadProperties.username())
                .password(ReadProperties.shortPassword())
                .build();
        open("");
    }
    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
