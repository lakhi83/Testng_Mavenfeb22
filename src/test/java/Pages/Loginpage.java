package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Testcases.Baseclass;

public class Loginpage {
	WebDriver driver = Baseclass.driver;
	
	ExtentTest test = Baseclass.test;
	
	
	//===================WEbElement===================
	
	@FindBy(className="login")
	WebElement LoginLink;
	
	@FindBy(name="user_login")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(name="btn_login")
	WebElement LoginBtn;
	
	@FindBy(className="rememberMe")
	WebElement  RememberMe;
	
	public  Loginpage() {
		
		PageFactory.initElements(driver, this);

	}
	
	
	
//===================Function===================	

public void LoginFunction(String UserNameVal, String PasswordVal) {
		
		LoginLink.click();
		
		test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
		
			
		UserName.sendKeys(UserNameVal);
		test.log(LogStatus.PASS, "Enter Email Address", "Email entered successfully");
			
		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS, "Enter Password", "Password entered successfully");
		
		RememberMe.click();
		test.log(LogStatus.PASS, "Click on Remember Me", "clicked successfully");
		
		LoginBtn.click();
		
		test.log(LogStatus.PASS, "Click on Login Button", "Login button clicked successfully");
	}




}