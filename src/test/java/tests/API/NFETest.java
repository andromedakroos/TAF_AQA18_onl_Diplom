package tests.API;

import baseEntities.BaseApiTest;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NFETest extends BaseApiTest {
    private int milestoneID;

    @Test(priority = 2)
    public void addMilestoneTest() {
        milestoneID = milestoneAdapter.add(pathForMilestone, projectID).getId();
    }

    @Test(dependsOnMethods = "addMilestoneTest")
    public void getOneMilestone() {
        Assert.assertEquals(milestoneAdapter.getOne(milestoneID).getId(), milestoneID);
    }

    @Test(priority = 1)
    public void getAllMilestones() {
        milestoneAdapter.add(pathForMilestone, projectID);
        milestoneAdapter.add(pathForMilestone, projectID);

        Assert.assertEquals(milestoneAdapter.getAll(projectID).getSize(), 2);
    }

    @Test(dependsOnMethods = "addMilestoneTest")
    public void updateMilestone() {
        Assert.assertTrue(milestoneAdapter
                .update(pathForUpdateMilestone, milestoneID).is_completed());
    }

    @Test
    public void getProject() {
        Assert.assertEquals(projectAdapter.get(projectID).getId(), projectID);
    }

    @AfterTest
    public void deleteMilestone() {
        if (milestoneID > 0) {
            Assert.assertEquals(milestoneAdapter.delete(milestoneID).getStatusCode(),
                    HttpStatus.SC_OK);
        }
    }
}
