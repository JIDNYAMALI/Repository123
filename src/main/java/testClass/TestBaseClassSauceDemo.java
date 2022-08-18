package testClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com_SauceDemo_UtilityPackage.Screenshot_Class;
import pomClass.POMofLoginPage;

//import pack.POMofSauceDemoLoginPage;

public class TestBaseClassSauceDemo {	

	WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException {
		if(browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Prajakta Mali\\OneDrive\\Desktop\\filesOfSelenium\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		else 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Prajakta Mali\\OneDrive\\Desktop\\filesOfSelenium\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			
		}
		
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
	driver.get("https://www.saucedemo.com/");
	System.out.println("url is opened");
	Screenshot_Class.takeScreenshot(driver);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	POMofLoginPage sd= new POMofLoginPage(driver);
	sd.sendUserName();
	System.out.println("userName entered");
	
	sd.sendPassword();
	System.out.println("password entered");
	
	
	sd.clickOnLoginButton();
	System.out.println("clicked on login button");
	System.out.println("this is homepage");
	Screenshot_Class.takeScreenshot(driver);

	}

	@AfterMethod
	public void tearDrop()
	{
	driver.quit();
	System.out.println("browser is closed");
	}
	
}
