package test;

import org.testng.annotations.Test;

import source.Homepage;
import source.Loginpage;
import source.Searchresultspage;

public class Testcase3 extends Launchandquit 
{
	
	
	@Test

	public void login() throws InterruptedException {

		

		Homepage home = new Homepage(driver);

		home.accountandlists_hoverhover(driver);
		Thread.sleep(2000);
		home.signin_method();
		Loginpage login = new Loginpage(driver);
		login.email();
		login.continue_but();
		Thread.sleep(2000);
		login.password();
		login.submit();
		home.searching();
		
		Searchresultspage s1= new Searchresultspage(driver);
		s1.product();
		s1.wishlist(driver);
}

}
