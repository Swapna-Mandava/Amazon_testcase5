package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage 
{WebDriver driver;
	
	@FindBy(xpath="//a[.='View Your List']")   WebElement viewyourlist;

	@FindBy(xpath="(//span[@class='a-button a-button-normal a-button-primary a-button-icon wl-info-aa_add_to_cart'])[2]")   WebElement addtocart;
	@FindBy(xpath="(//input[@name='submit.deleteItem'])[2]")   WebElement removefromwishlist;
	
	public void viewyourcart(WebDriver driver)  {
		this.driver=driver;
		driver.switchTo().defaultContent();
		
		viewyourlist.click();
		
	
	}
	
	public void addingfromwishlist() {
		addtocart.click();
		removefromwishlist.click();
	}
	
	public Wishlistpage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}

