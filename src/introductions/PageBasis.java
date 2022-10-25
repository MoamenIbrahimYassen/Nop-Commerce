package introductions;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBasis {
protected WebDriver driver ;
public PageBasis  (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements( driver , this);
}
public void click (WebElement button)
{
	button.click();
}
public void txt (WebElement text , String value)
{
	text.sendKeys(value);
}
public void assertion (WebElement element , String value)
{
	assertEquals(element, value);
}

}
