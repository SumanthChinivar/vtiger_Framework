package organization;

import org.automation.base.Base_Test;
import org.automation.element_repository.Organization_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TC_VT_008_Test extends Base_Test{

	@Test
	public void toVerifyAdditionOfNewGroup()
	{
		Organization_Page org=new Organization_Page(driver);
		org.getOrganizationsLink().click();
		org.getGotoAdvancedSearchLink().click();
		org.getGetNewGroupLink().click();
		boolean value=org.getGetConditionDropDown().isDisplayed();
		Assert.assertEquals(value,true,"New group is not added");
		Reporter.log("New group is added",true);
	}
}
