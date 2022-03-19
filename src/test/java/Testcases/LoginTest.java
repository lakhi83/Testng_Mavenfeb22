package Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Loginpage;

public class LoginTest extends Baseclass  {
	

	@Test
	public void LoginFailiureTest() {
		
		//test=   report.startTest("LoginFailiureTest");
		
		Loginpage login = new Loginpage();
		
		login.LoginFunction("xyz@abc.com","Abc@12345");
		
		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		
		String ActualMsg = ErrorMsg.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(ActualMsg, ExpMsg);
		
	//	report.endTest(test);
		
	}
	
	@Test
	public void LoginSuccessTest() {
		Loginpage login = new Loginpage();
		
		login.LoginFunction("xyz@abc.com","Abc@12345");
		
	}
	

  @Test(enabled=false)
	@Parameters({"Param1","Param2"})
	public void ParameterizedTest(String UserNameVal, String PasswordVal) {
		
	Loginpage login = new Loginpage();
		login.LoginFunction(UserNameVal,PasswordVal);		
		
	}

@Test
public void ExternalDataTest() {
		
		String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
		Loginpage login = new Loginpage();
		login.LoginFunction(UserNameVal,PasswordVal);		
	}




	
	
}



