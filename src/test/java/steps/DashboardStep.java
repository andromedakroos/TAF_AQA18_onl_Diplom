package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import models.Project;

public class DashboardStep extends BaseStep {
    @Step
    public void goToProjectCreation(){
        dashboardPage.getAddProjectButton().click();
    }
    @Step
    public void goToProject(){
        dashboardPage.getProjectName().click();
    }
}
