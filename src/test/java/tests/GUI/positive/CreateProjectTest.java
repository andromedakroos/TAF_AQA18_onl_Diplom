package tests.GUI.positive;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class CreateProjectTest extends BaseTest {
    @Test(description = "Тест на создание сущности (проекта)")
    public void createProjectTest(){
        loginStep.loginSuccessful(userSuccessful);
        dashboardStep.goToProjectCreation();
        projectStep.createProject(project);
    }
}
