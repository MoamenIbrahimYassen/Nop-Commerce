package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import introductions.PageBasis;



public class Regesteration extends PageBasis  {


	public Regesteration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="gender-male")
	public
	WebElement maleradiobutton ;
	@FindBy(id="FirstName")
	WebElement ostname ;
	@FindBy(id="LastName")
	WebElement secondname ;
	@FindBy(id="Email")
	WebElement Email ;
	@FindBy(id="Password")
	WebElement pass ;
	@FindBy(id="ConfirmPassword")
	WebElement repass ;
	@FindBy(id="register-button")
	public
	WebElement Resges;
	@FindBy(css="div.result")
	public
	WebElement trueor ;
	public void regesteration (String fname , String lname , String passworda , String gmail)
	{
		click(maleradiobutton);
		txt(ostname, fname);
		txt(secondname, lname);
		txt(Email, gmail);
		txt(pass, passworda);
		txt(repass, passworda);
		click(Resges);
	}


}
