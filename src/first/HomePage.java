package first;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import introductions.PageBasis;

public class HomePage extends PageBasis {

	public HomePage(WebDriver driver) {
		super(driver);


	}
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement homepage ;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public
	WebElement logout ; 
	public void openregestrationpage ()
	{
		click(homepage);
	}
	public void LogoutAfterRegesteration ()
	{
		click(logout);
	}

}
