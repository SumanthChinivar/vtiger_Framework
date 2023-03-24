package organization;

import org.automation.base.Base_Test;
import org.automation.element_repository.Organization_Page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_VT_004_Test extends Base_Test {

	@Test
	public void toClickOnSearchButton()
	{
		Organization_Page org=new Organization_Page(driver);
		org.getOrganizationsLink().click();
		org.getSearchTextField().click();
		org.getFindButton().click();
		String expres="Please enter at least one letter or number for your search ...";
		String actRes=driver.findElement(By.xpath("//em[contains(text(),'Please enter']")).getText();
		Assert.assertEquals(actRes,expres,"Search was not executed properly");
		Reporter.log("Search was executed properly",true);
	}
}
