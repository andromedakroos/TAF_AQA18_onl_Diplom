package tests.API;

import baseEntities.BaseApiTest;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NFETest extends BaseApiTest {
    private int milestoneID;

    @Test
    public void addMilestoneTest() {
        milestoneID = milestoneAdapter.add(pathForMilestone, projectID).getId();
    }

    @Test(dependsOnMethods = "addMilestoneTest")
    public void getOneMilestone() {
        Assert.assertEquals(milestoneAdapter.getOne(milestoneID).getId(), milestoneID);
    }

    @Test(dependsOnMethods = "addMilestoneTest")
    public void getAllMilestones() {
        Assert.assertEquals(milestoneAdapter.getAll(projectID).getSize(), 1);
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
