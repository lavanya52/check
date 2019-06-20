package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority=1)
	public void Test()
	{
	
	WebDriver driver ;
	String URL = "https://mail.google.com";

	System.out.println(URL);
	FirefoxProfile profile = new FirefoxProfile();

	
	driver = new FirefoxDriver(profile);
	driver.get(URL);
	driver.manage().window().maximize();

	}
}
