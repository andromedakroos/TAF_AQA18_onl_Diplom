package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import models.Project;

public class ProjectStep extends BaseStep {
    @Step
    public void createProject(Project project){
        logger.info("In step createProject Project object is using, wich contains fields: " + project);
        addProjectPage.getProjectNameInput().setValue(project.getName());
        addProjectPage.getProjectAnnouncementInput().setValue(project.getAnnouncement());
        addProjectPage.getShowAnnouncementCheckbox().click();
        addProjectPage.getSingleSuiteButton().click();
        addProjectPage.getAddProjectButton().click();
        projectOverviewPage.getSuccessfulMessage();
    }
}
