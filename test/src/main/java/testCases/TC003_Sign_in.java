package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driverMethods.ProjectMethods;
import pages.HomePage;

public class TC003_Sign_in extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_Sign_in";
		testCaseName = "TC003_Sign_in";
		testDescription = "To Test Sign In";
		category= "Smoke";
		authors	="Fiyaz";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	public void SignIn(String uName,String pwd) throws InterruptedException
	{
		new HomePage(driver, test)
		.clickSignInButton()
		.enterUname(uName)
		.enterPasswd(pwd)
		.clickSignIn();
	}
	

}
