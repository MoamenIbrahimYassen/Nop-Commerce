package Testsexecution;
import static org.testng.Assert.assertTrue;
import java.util.UUID;
import org.testng.annotations.Test;
import first.HomePage;
import first.Login;
import first.Regesteration;
import first.SearchProductAndPressOnTheButton;
import first.SearchWithOutClickOnButton;
public class Testcases extends Prepreation  {
	String firstname = "ahmed" ;
	String lastname ="Mohamed" ;
	String gmail = UUID.randomUUID().toString() + "@gmail.cm";
	String password = "0123456789" ;
	Regesteration rejes ;
	HomePage homeobj ;
	Login login ; 
	SearchProductAndPressOnTheButton sear ;
	SearchWithOutClickOnButton searchwithoutbutton;
	@Test(priority = 0)
	public void OpenHomePage ()
	{
		homeobj = new HomePage(driver);
		homeobj.openregestrationpage();
	}
	@Test(dependsOnMethods = {"OpenHomePage"})
	public void Regester () throws InterruptedException
	{
		rejes = new Regesteration(driver);
		rejes.maleradiobutton.click();
		rejes.regesteration(firstname, lastname, password, gmail);
	}
	@Test(dependsOnMethods = {"Regester"} )
	public void Logout (){homeobj.LogoutAfterRegesteration();}
	
	
	
	@Test(dependsOnMethods = {"Logout"} )
	public void Login () throws InterruptedException
	{
		login = new Login(driver);
		login.loginPage(gmail,password);
		Thread.sleep(500);
		assertTrue(homeobj.logout.getText().contains("Log out"));
	}

	@Test(dependsOnMethods = {"Login"} )
	public void SEARCH() throws InterruptedException
	{

		searchwithoutbutton = new SearchWithOutClickOnButton(driver);
		searchwithoutbutton.SearchWithoutButton("Mac");
	}
}

