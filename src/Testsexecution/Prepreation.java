package Testsexecution;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import introductions.ScreenShot;
public class Prepreation  {

	public static WebDriver driver ;

	@BeforeSuite
	@Parameters({"browser"})
	public void bef (String Crossdrivers) {

		if (Crossdrivers.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenuim webdriver\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver ();
		}
		else if (Crossdrivers.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\momen\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver ();

		}

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}
	@AfterMethod
	public void takescreenshoot (ITestResult result) throws IOException 
	{
		if (result.getStatus()==ITestResult.FAILURE) 
		{
			System.out.print("This is am mistake in System"); 
			ScreenShot.screeen(driver, result.getName());
		}
	}
	@AfterSuite
	public void aft () throws InterruptedException
	{
		
		driver.quit();
	}



}
