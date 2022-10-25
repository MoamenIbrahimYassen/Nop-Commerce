package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import introductions.PageBasis;

public class Login extends PageBasis {

	public Login(WebDriver driver) {
		super(driver);

	}
	@FindBy (xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement loginn;
	@FindBy (id="Email")
	WebElement EnterYourEmail ;
	@FindBy (xpath="//*[@id=\"Password\"]")
	WebElement EnterYourPassword ;
	@FindBy (xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement PressOnLoginButton ; 
	
	public void loginPage (String enterusername , String enterpassword)
	{
		click(loginn);
		txt(EnterYourEmail, enterusername);
		txt(EnterYourPassword, enterpassword);
		click(PressOnLoginButton);
	}



}
