package testClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TCO6CrossBrowserTestClass{
	WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
	public void setupMethod(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Prajakta Mali\\OneDrive\\Desktop\\filesOfSelenium\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Prajakta Mali\\OneDrive\\Desktop\\filesOfSelenium\\chromedriver_win32 (1)\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("throw error");
		}
	}
}
