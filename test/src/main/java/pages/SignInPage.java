package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import driverMethods.ProjectMethods;

public class SignInPage extends ProjectMethods{
	
	public SignInPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("CashKaro Beta")) {
			throw new RuntimeException();
		}
	}
	
	
	@FindBy(how=How.ID,using="uname")
	private WebElement eleUname;
	public SignInPage enterUname(String uName) {
		type(eleUname,uName);
		return this;
	}
	
	@FindBy(how=How.ID,using="pwd")
	private WebElement elePswd;
	public SignInPage enterPasswd(String pwd) {
		type(elePswd,pwd);
		return this;
	}
	
	@FindBy(how=How.ID,using="btnLayoutSignIn")
	private WebElement eleSignInButton;
	public SignInPage clickSignIn() throws InterruptedException {
		click(eleSignInButton);
		Thread.sleep(10000);
		return this;
	}
	
	

}
