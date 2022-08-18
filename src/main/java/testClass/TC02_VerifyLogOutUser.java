package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClass.POMofhomepageSauceDemo;


public class TC02_VerifyLogOutUser extends TestBaseClassSauceDemo{

	@Test
	public void userLoggedOut() 
	{
		POMofhomepageSauceDemo hp= new POMofhomepageSauceDemo(driver);
		hp.clickOnSettingBtn();
		System.out.println("clicked on setting Button");
		
		hp.clickOnLogOutBtn();
		System.out.println("clicked on logout Button");
		
//		validation
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle,expectedTitle );
		
	}	
	}

