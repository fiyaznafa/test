package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverMethods.ProjectMethods;
import pages.HomePage;

public class TC002_SignUp_FaceBook extends ProjectMethods{

	@BeforeClass
	public void setData() {
		dataSheetName = "TC002_SignUp_FaceBook";
		testCaseName = "TC002_SignUp_FaceBook";
		testDescription = "To Test Joining functionality using Facebook";
		category= "Smoke";
		authors	="Fiyaz";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void join_Facebook(String email,String pwd){
	new HomePage(driver, test)
	.clickJoinFreeButton()
	.clickFacebookLink()
	.enterEmailId(email)
	.enterPassword(pwd)
	.clickLogin();
	}
}
