package pomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMofhomepageSauceDemo {
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingButton; 
	public void clickOnSettingBtn() 
	{
		settingButton.click();
//		act.click(settingButton).perform();
	}

	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
	public void clickOnLogOutBtn() 
	{
		logOutButton.click();
//		act.click(logOutButton).perform();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement productBag;
	public void productBagAddtoCart() 
	{
//		act.click(productBag).perform();
		productBag.click();	
	}
	@FindBy(xpath="//span[text()='1']")
	private WebElement shoppingCartBadge;
	public String getTextOfBag() 
	{
		// TODO Auto-generated method stub
		String totalProduct1=shoppingCartBadge.getText();
		return totalProduct1;
	}
	
	
//	multiple product
	//allProduct Elements
		@FindBy(xpath="//button[text()='Add to cart']")
		private List<WebElement> allProducts;
		public void allProduct() {
		for(int i=0; i<allProducts.size();i++)
		{
				allProducts.get(i).click();
		}
			
//		for(WebElement product:allProducts) 
//		{
//		product.click();	
//		}
		}
		@FindBy(xpath="//span[text()='6']")
		private WebElement shoppingCart6;
		public String getTextproduct66() 
		{
			String totalProduct6=shoppingCart6.getText();	
		return totalProduct6;	
		}
		
	public POMofhomepageSauceDemo(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
//		act=new Actions(driver);
	}
}
