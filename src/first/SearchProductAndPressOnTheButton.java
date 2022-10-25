package first;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import introductions.PageBasis;

public class SearchProductAndPressOnTheButton extends PageBasis {

	public SearchProductAndPressOnTheButton(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="small-searchterms")
	WebElement SearchBar;
	@FindBy (xpath="//*[@id=\"small-search-box-form\"]/button")
	WebElement SearchButton ;
	@FindBy (xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
	WebElement ProductPath ; 
	@FindBy (xpath="//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[1]/h1")
	WebElement Productnameexist ;

	public void Searchengine (String prdouctname) throws InterruptedException
	{
		txt(SearchBar, prdouctname);

		click(SearchButton);
		click(ProductPath);		
		if(Productnameexist.isDisplayed())
		{
			System.out.println(true + "Exist");
		}
		}

}
