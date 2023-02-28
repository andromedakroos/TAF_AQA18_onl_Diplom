package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;

public class DashboardStep extends BaseStep {
    @Step
    public void goToProjectCreation(){
        dashboardPage.getAddProjectButton().click();
    }
}
