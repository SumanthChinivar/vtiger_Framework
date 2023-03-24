package organization;

import org.automation.base.Base_Test;
import org.automation.element_repository.Organization_Page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class TC_VT_007_Test extends Base_Test {

	@Test
	public void toVerifyAdvancedSearchButton()
	{
		Organization_Page org=new Organization_Page(driver);
		org.getOrganizationsLink().click();
		org.getGotoAdvancedSearchLink().click();
		String actRes=driver.findElement(By.xpath("//b[text()='Advanced Search']")).getText();
		String expRes="Advanced Search";
		Assert.assertEquals(expRes, expRes,"Advanced Search Is not Opened");
		Reporter.log("Advanced Search is displayed",true);
	}
}
