package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import models.Project;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

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
    @Step
    public void goBackToDashboard(){
        projectOverviewPage.getDashboardButton().click();
        dashboardPage.getAddProjectButton();
    }

    @Step
    public void goToTestCases(){
        projectPage.getTestCasesSection().click();
    }
    @Step
    public void uploadFile(String pathToFile) throws InterruptedException {
        projectPage.getAddTestCaseButton().click();
        testCasesPage.getAttachFileButton().click();
        testCasesPage.getOpenLibraryButton().click();
//        testCasesPage.getOpenLibraryButton().uploadFile(new File(pathToFile));
        testCasesPage.getOpenLibraryButton().sendKeys(pathToFile);
//        testCasesPage.getImageSubmitButton().click();
        testCasesPage.getSubmitAttachButton().submit();
//        System.out.println(testCasesPage.getAttachmentName().getText());
    }

    @Step
    public void uploadFileMilestone() throws InterruptedException {
        String pathToFile = ProjectStep.class.getClassLoader().getResource("testcaselogo.png").getPath().substring(1);
        System.out.println(pathToFile);
        projectPage.getMilestoneSection().click();
        $(By.id("navigation-milestones-add")).click();
        $(By.className("icon-markdown-image")).click();
        Thread.sleep(2000);
//        $(By.id("libraryAddAttachment")).sendKeys(pathToFile);
        $(By.id("libraryAddAttachment")).setValue(pathToFile);
//        testCasesPage.getOpenLibraryButton().uploadFile(new File(pathToFile));
//        testCasesPage.getOpenLibraryButton().click();
//        testCasesPage.getOpenLibraryButton().sendKeys(pathToFile);
        Thread.sleep(2000);
//        testCasesPage.getImageSubmitButton().click();
        testCasesPage.getSubmitAttachButton().submit();
//        System.out.println(testCasesPage.getAttachmentName().getText());
    }

    @Step
    public void createTestCase(){

    }
}
