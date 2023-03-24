package organization;

import org.automation.base.Base_Test;
import org.automation.element_repository.Organization_Page;
import org.automation.generic_utilities.ActionsUtil;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_VT_003_Test extends Base_Test{

	@Test
	public void toClickOnUnselectAllbutton()
	{
		Organization_Page org=new Organization_Page(driver);
		org.getOrganizationsLink().click();
		org.getDownArrow().click();
		org.getUnselectAllButton().click();
		boolean val=org.getUnselectAllButton().isDisplayed();
		Assert.assertEquals(val, true,"Drop down is closed");
		Reporter.log("Dropdown is not closed",true);
	}
}