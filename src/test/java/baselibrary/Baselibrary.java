package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baselibrary 
{
	@Test
	public void launchURL()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:testingbaba.com/old/");
		driver.manage().window().maximize();
	}

}
