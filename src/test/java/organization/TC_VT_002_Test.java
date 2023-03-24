package organization;

import org.automation.base.Base_Test;
import org.automation.element_repository.Organization_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_VT_002_Test extends Base_Test {

	@Test
	public void toClickOnSearchTextField()
	{
		Organization_Page org=new Organization_Page(driver);
		//To click organization Button
		org.getOrganizationsLink().click();
		org.getDownArrow().click();;
		boolean val=org.getSelectAllButton().isDisplayed();
		Assert.assertEquals(val, true , "Dropdown is not displayed");
		Reporter.log("DropDown is displayed",true);
		
	}
}
