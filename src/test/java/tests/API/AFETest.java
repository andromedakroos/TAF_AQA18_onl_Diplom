package tests.API;

import baseEntities.BaseApiTest;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AFETest extends BaseApiTest {

    @Test
    public void addMilestoneWithLongNameTest() {
        Assert.assertEquals(milestoneAdapter.add(pathForIncorrectMilestone, projectID).getError(),
                "Field :name is too long (250 characters at most).");
    }

    @Test
    public void getOneNotValidIDMilestone() {
        Assert.assertEquals(milestoneAdapter.getOne(0).getError(),
                "Field :milestone_id is not a valid milestone.");
    }

    @Test
    public void getAllNotValidIDMilestones() {
        Assert.assertEquals(milestoneAdapter.getAll(0).getError(),
                "Field :project_id is not a valid or accessible project.");
    }

    @Test
    public void updateMilestoneWithNotValidID() {
        Assert.assertEquals(milestoneAdapter
                .update(pathForUpdateMilestone, 0).getError(),
                "Field :milestone_id is not a valid milestone.");
    }

    @Test
    public void getProjectWithNotValidID() {
        Assert.assertEquals(projectAdapter.get(0).getError(),
                "Field :project_id is not a valid or accessible project.");
    }

    @Test
    public void deleteMilestoneWithNotValidID() {
        Assert.assertEquals(milestoneAdapter.delete(0).getStatusCode(),
                HttpStatus.SC_BAD_REQUEST);
    }
}
