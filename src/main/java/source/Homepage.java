package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{  WebDriver driver;

	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement accountandlists;
	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	WebElement hellosignin;
	@FindBy(id="twotabsearchtextbox") WebElement searchbox;

	public void accountandlists_hoverhover(WebDriver driver) {
          this.driver=driver;
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandlists).perform();
	}

	public void signin_method() {
		hellosignin.click();
	}
	public void searching() {
		searchbox.sendKeys("shoe"+Keys.ENTER);
	}


	public Homepage(WebDriver driver) {
		  this.driver=driver;
		PageFactory.initElements(driver, this);
		;
	}

}
