package tests.GUI.positive;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import steps.ProjectStep;

public class FileUploadTest extends BaseTest {
    @Test(description = "Тест на загрузку файла")
    public void uploadFileTest() throws InterruptedException {
        String pathToFile = FileUploadTest.class.getClassLoader().getResource("testcaselogo.png").getPath().substring(1);
        loginStep.loginSuccessful(userSuccessful);
//        dashboardStep.goToProjectCreation();
//        projectStep.createProject(project);
//        projectStep.goBackToDashboard();
        dashboardStep.goToProject();
//        projectStep.goToTestCases();
        projectStep.uploadFile(pathToFile);
    }
}
