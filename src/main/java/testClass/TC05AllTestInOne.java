package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClass.POMofhomepageSauceDemo;

public class TC05AllTestInOne extends TestBaseClassSauceDemo{

//login
	@Test
	public void verifyUserLoginSuccessfully()
	{
//		validation
		
		String expectedTitle ="Swag Labs";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		//hard //actual , expected
		Assert.assertEquals(actualTitle, expectedTitle);
			
	}
	
//	logout
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
	
//	bag product add to cart
	@Test
	public void bagProductaddToCart()
	{
//		bag add to cart
		POMofhomepageSauceDemo hp=new POMofhomepageSauceDemo(driver);
		hp.productBagAddtoCart();
		System.out.println("bag is add to cart");
//		validation
		String actualProduct=hp.getTextOfBag();
		System.out.println("actual products : "+actualProduct);
		String expectedprodct="1";
		Assert.assertEquals(actualProduct, expectedprodct);
		}
	
//	multi product add to cart
	@Test
	public void multiProduct()
	{
		POMofhomepageSauceDemo hp=new POMofhomepageSauceDemo(driver);
		hp.allProduct();
		System.out.println("clicked on multiproducts");
		
//		validation
		String product6=hp.getTextproduct66();
		System.out.println(product6);
		String expectedProduct="6";
	
		Assert.assertEquals(product6,expectedProduct );
		
	}
}
