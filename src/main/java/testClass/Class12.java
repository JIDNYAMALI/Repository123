package testClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class12 {
	@Test
	public void method1()
	{
		System.out.println("Hii this is test method");
	}
	@AfterMethod
	public void aftermethod1() 
	{
	System.out.println("this is after method");	
	}
	
	@BeforeMethod
	public void beforemethod1()
	{
		System.out.println("this is before method");
	}

}
