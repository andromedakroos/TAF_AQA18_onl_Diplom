package steps;

import baseEntities.BaseStep;
import configuration.ReadProperties;
import pages.LoginPage;

public class LoginStep extends BaseStep {

    public LoginStep(){
        loginPage = new LoginPage();
    }

    public void loginSuccessful(){
        loginPage.getUsernameInput().setValue(ReadProperties.username());
        loginPage.getPasswordInput().setValue(ReadProperties.password());
        loginPage.getLoginButton().click();
    }
}
