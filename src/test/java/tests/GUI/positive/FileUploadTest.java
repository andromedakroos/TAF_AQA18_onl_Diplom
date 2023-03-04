package tests.GUI.positive;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    @Test(description = "Тест на загрузку файла")
    public void uploadFileTest() throws InterruptedException {
        loginStep.loginSuccessful(userSuccessful);
//        dashboardStep.goToProjectCreation();
//        projectStep.createProject(project);
//        projectStep.goBackToDashboard();
        dashboardStep.goToProject();
//        projectStep.goToTestCases();
        projectStep.uploadFileMilestone();

    }
}
