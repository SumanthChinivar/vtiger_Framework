package organization;

import org.automation.base.Base_Test;
import org.automation.element_repository.Organization_Page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_VT_005_Test extends Base_Test{

	@Test
	public void ToCheckCreateOrganizationAvailability()
	{
		Organization_Page org=new Organization_Page(driver);
		org.getOrganizationsLink().click();
		org.getQuickCreateDropDown().click();
		boolean val=driver.findElement(By.xpath("//option[@value='Accounts']")).isDisplayed();
		Assert.assertEquals(val, true, "Cretae organization is not displayed");
		Reporter.log("Cretae organization is available in the dropdown",true);
	}
}
