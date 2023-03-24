package organization;

import org.automation.base.Base_Test;
import org.automation.element_repository.Organization_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class TC_VT_006_Test extends Base_Test {

	@Test
	public void toOpenCreateOrganizationPage()
	{
		Organization_Page org=new Organization_Page(driver);
		org.getOrganizationsLink().click();
		org.getCreateOrganizationButton().click();
		String expRes="http://localhost:8888/index.php?module=Accounts&action=EditView&return_action=DetailView&parenttab=Marketing";
		String actRes=driver.getCurrentUrl();
		Assert.assertEquals(actRes, expRes,"Create Organization is not opened");
		Reporter.log("Create organization page is displayed",true);
	}
}
