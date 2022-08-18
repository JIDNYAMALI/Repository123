package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClass.POMofhomepageSauceDemo;

public class TC03_BagProductAddToCart extends TestBaseClassSauceDemo{

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
	
}
