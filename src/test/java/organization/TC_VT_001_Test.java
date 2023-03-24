package organization;

import org.automation.base.Base_Test;
import org.automation.element_repository.Organization_Page;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TC_VT_001_Test extends Base_Test {

	@Test
	public void toClickOnOrganizationPage()
	{
		Organization_Page org=new Organization_Page(driver);
		org.getOrganizationsLink().click();
		String expectedOrganizationPageTitle="Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM";
		Assert.assertEquals(driver.getTitle(), expectedOrganizationPageTitle, "Organization page is not displayed");
		Reporter.log("Organization page is opened");
	}
}
