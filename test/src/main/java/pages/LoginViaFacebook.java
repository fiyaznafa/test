package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import driverMethods.ProjectMethods;

public class LoginViaFacebook extends ProjectMethods{

		public LoginViaFacebook(RemoteWebDriver driver,ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;	
		PageFactory.initElements(driver, this);
		if(!verifyTitle("Facebook"))
			throw new RuntimeException();
			}
		
		@FindBy(how=How.ID,using="email")
		private WebElement eleEmailId;
		public LoginViaFacebook enterEmailId(String email){
			type(eleEmailId, email);
			return this;
		}
		
		@FindBy(how=How.ID,using="pass")
		private WebElement elePass;
		public LoginViaFacebook enterPassword(String pwd){
			type(elePass, pwd);
			return this;
		}
		
		
		@FindBy(how=How.ID,using="pass")
		private WebElement eleLoginButton;
		public SignUpPage clickLogin(){
			click(eleLoginButton);
			switchToWindow(0);
			return new SignUpPage(driver, test);
		}
		
		
}
