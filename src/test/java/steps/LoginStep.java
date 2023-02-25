package steps;

import baseEntities.BaseStep;
import configuration.ReadProperties;
import models.User;
import pages.LoginPage;

public class LoginStep extends BaseStep {

    public LoginStep(){
        loginPage = new LoginPage();
    }

    public void loginSuccessful(User user){
        loginPage.getUsernameInput().setValue(user.getName());
        loginPage.getPasswordInput().setValue(user.getPassword());
        loginPage.getLoginButton().click();
        //return dashboardPage
    }

    public boolean loginIncorrect(User user){
        loginPage.getUsernameInput().setValue(user.getName());
        loginPage.getPasswordInput().setValue(user.getPassword());
        loginPage.getLoginButton().click();
        return loginPage.getWrongDataError().exists();
    }

    public boolean loginWithLongPassword(User user){
        loginPage.getUsernameInput().setValue(user.getName());
        loginPage.getPasswordInput().setValue(user.getPassword());
        loginPage.getLoginButton().click();
        return loginPage.getPasswordLengthError().exists();
    }
}
