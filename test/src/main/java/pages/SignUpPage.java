package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import driverMethods.SeleniumMethods;

public class SignUpPage extends SeleniumMethods{

	public SignUpPage(RemoteWebDriver driver,ExtentTest test) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.test=test;	
		PageFactory.initElements(driver, this);
		if(!verifyTitle("Join CashKaro Free - India's No1 Cashback & Coupons Site"))
			throw new RuntimeException();
			}
	
	@FindBy(how=How.ID,using="firstname")
	private WebElement eleFirstName; 
	public SignUpPage enterFirstName(String fName){
		type(eleFirstName,fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="email")
	private WebElement eleEmailID; 
	public SignUpPage enterEmailID(String email){
		type(eleEmailID,email);
		return this;
		}
	
	@FindBy(how=How.ID,using="con_email")
	private WebElement eleConfEmail; 
	public SignUpPage enterConfEmail(String email){
		type(eleConfEmail,email);
		return this;
		}	
	
	@FindBy(how=How.ID,using="pwd-txt")
	private WebElement elePassword; 
	public SignUpPage enterPassword(String pwd){
		type(elePassword,pwd);
		return this;
		}	

	@FindBy(how=How.ID,using="join_free_submit")
	private WebElement eleJoinButton; 
	public HomePage clickJoinButton(){
		click(eleJoinButton);
		return new HomePage(driver, test);
		}	

	@FindBy(how=How.ID,using="close_and_go_fb")
	private WebElement eleFacebookLink;
	public LoginViaFacebook clickFacebookLink(){
		click(eleFacebookLink);
		switchToWindow(1);
		driver.manage().window().maximize();
		return new LoginViaFacebook(driver, test);
	}
	
	
}