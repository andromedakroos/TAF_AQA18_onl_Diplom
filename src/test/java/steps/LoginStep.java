package steps;

import baseEntities.BaseStep;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.webdriver.UrlStartingWith;
import configuration.ReadProperties;
import models.User;
import pages.LoginPage;

public class LoginStep extends BaseStep {
    public void clearPasswordField(){
        loginPage.getPasswordInput().clear();
    }

    public void loginSuccessful(User user){
        loginPage.getUsernameInput().setValue(user.getName());
        loginPage.getPasswordInput().setValue(user.getPassword());
        loginPage.getLoginButton().click();
    }

    public SelenideElement loginIncorrect(User user){
        loginPage.getUsernameInput().setValue(user.getName());
        loginPage.getPasswordInput().setValue(user.getPassword());
        loginPage.getLoginButton().click();
        return loginPage.getWrongDataError();
    }

    public SelenideElement loginWithLongPassword(User user){
        loginPage.getUsernameInput().setValue(user.getName());
        loginPage.getPasswordInput().setValue(user.getPassword());
        loginPage.getLoginButton().click();
        return loginPage.getLongPasswordError();
    }
    public SelenideElement loginWithShortPassword(User user){
        loginPage.getUsernameInput().setValue(user.getName());
        loginPage.getPasswordInput().setValue(user.getPassword());
        loginPage.getLoginButton().click();
        return loginPage.getShortPasswordError();
    }
}
