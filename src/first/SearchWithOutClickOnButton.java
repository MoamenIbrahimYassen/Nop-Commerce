package first;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import introductions.PageBasis;

public class SearchWithOutClickOnButton extends PageBasis {

	public SearchWithOutClickOnButton(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="small-searchterms")
	WebElement SearchBar;
	@FindBy (xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
	WebElement ProductPath ; 
	@FindBy (xpath="//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[1]/h1")
	WebElement Productnameexist ;
	@FindBy (id="ui-id-1")
	List<WebElement> list ; 
	public void SearchWithoutButton (String productnamewithoutbutton) throws InterruptedException
	{
		txt(SearchBar, productnamewithoutbutton);
		Thread.sleep(900);
		
		list.get(0).click() ;
		
	}
}

