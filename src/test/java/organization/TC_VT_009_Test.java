package organization;

import org.automation.base.Base_Test;
import org.automation.element_repository.Organization_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_VT_009_Test extends Base_Test{

	@Test
	public void closeSearch()
	{
		Organization_Page org=new Organization_Page(driver);
		org.getOrganizationsLink().click();
		org.getDownArrow().click();
		org.getCloseSearchButton().click();
		boolean actRes=org.getTroubleTicketsLink().isDisplayed();
		Assert.assertEquals(actRes, true,"Dropdown is closed");
		Reporter.log("Drop down is closed");
	}
}
