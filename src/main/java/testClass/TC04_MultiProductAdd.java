package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClass.POMofhomepageSauceDemo;

public class TC04_MultiProductAdd extends TestBaseClassSauceDemo{
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

