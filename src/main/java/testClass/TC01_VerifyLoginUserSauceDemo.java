package testClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomClass.POMofLoginPage;

public class TC01_VerifyLoginUserSauceDemo extends TestBaseClassSauceDemo
{
	
	@Test
	public void userLogin()
	{
//		validation
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
	}
	
	
}

