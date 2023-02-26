package baseEntities;

import pages.LoginPage;

public class BaseStep {
    protected LoginPage loginPage;

    public BaseStep() {
        loginPage = new LoginPage();
    }
}
