package introductions;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class ScreenShot extends PageBasis{
	
	public ScreenShot(WebDriver driver) {super(driver);}
	
	public static void screeen (WebDriver driver  , String Shoots) throws IOException
	{
		Path dest = Paths.get("./screen" , Shoots + ".png");
		java.nio.file.Files.createDirectories(dest.getParent());
		FileOutputStream out = new FileOutputStream(dest.toString());
		out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
		out.close();

	}
}
