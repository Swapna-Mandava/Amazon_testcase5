package logintoamazon.Project_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage{
	
	WebDriver driver;
    @FindBy(id="ap_customer_name") WebElement Name;
    @FindBy(xpath="//input[@id='ap_phone_number']") WebElement phonenumber;
    @FindBy(id="ap_customer_name") WebElement password;
    @FindBy(id="continue") WebElement verifynumber;
    
    public void register(WebDriver driver) throws InterruptedException 
    {
        
    	Name.sendKeys("Suni Eadara");
    	phonenumber.sendKeys("8686619924");

    	password.sendKeys("Sunieadara");
    	verifynumber.click();
    	
    }
	
    public Registrationpage(WebDriver driver) 
    {
        this.driver=driver;
    PageFactory.initElements(driver, this);
    }

}
