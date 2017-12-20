package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverMethods.ProjectMethods;
import pages.HomePage;

public class TC001_Join_Free extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC001_Join_Free";
		testCaseName = "TC001_Join_Free";
		testDescription = "To Test Joining functionality using emailID";
		category= "Smoke";
		authors	="Fiyaz";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void join_free(String fname,String email,String pwd) {
		
		new HomePage(driver, test)
		.clickJoinFreeButton()
		.enterFirstName(fname)
		.enterEmailID(email)
		.enterConfEmail(email)
		.enterPassword(pwd)
		.clickJoinButton();

	}

}
