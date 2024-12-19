package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(id = "ap_email")
	WebElement username;
	@FindBy(id = "continue")
	WebElement continue_button;

	@FindBy(id = "ap_password")
	WebElement password;
	@FindBy(id = "signInSubmit")
	WebElement signin_button;

	public void email() {
       username.sendKeys("swapnamandava8419@gmail.com");
       
	}

	public void continue_but() {
		continue_button.click();
	}

	public void password() {
		password.sendKeys("Swapna@2791");
	}

	public void submit() {
		signin_button.click();
	}

	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}



/* public void email() {
       username.sendKeys("swapnamandava8419@gmail.com");
       continue_button.click();
       password.sendKeys("Swapna@2791");
       signin_button.click();*/  //we can write all methods in one method 
	

