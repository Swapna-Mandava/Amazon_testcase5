package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Searchresultspage 
{
	@FindBy(xpath="(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]") WebElement product1;
	@FindBy(id="wishListMainButton") WebElement addtowishlist;
	//@FindBy(xpath = "(//span[@class='a-button-text'])[25]")
	//WebElement continueshoppingbuttion; 
	
	public void product() {
		
		product1.click();
	}
	
public void wishlist(WebDriver driver) throws InterruptedException {
	
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> i1=s1.iterator();
	String parentid=i1.next();
	String childid=i1.next();
	driver.switchTo().window(childid);
	Thread.sleep(2000);
	addtowishlist.click();
	//continueshoppingbuttion.click();
		
	    
	}
	
	
	public Searchresultspage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
