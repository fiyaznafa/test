package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentTest;
import driverMethods.SeleniumMethods;



public class HomePage extends SeleniumMethods{
	
	public HomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("CashKaro Beta")) {
			throw new RuntimeException();
		}
	}
		
		@FindBy(how=How.LINK_TEXT,using="Join Free")
		private WebElement joinFreeButton;
		public SignUpPage clickJoinFreeButton(){
			click(joinFreeButton);
			return new SignUpPage(driver,test);	
		}
		
		
		@FindBy(how=How.LINK_TEXT,using="Sign in")
		private WebElement signInButton;
		public SignInPage clickSignInButton(){
			click(signInButton);
			return new SignInPage(driver,test);	
		}
		
		
}
