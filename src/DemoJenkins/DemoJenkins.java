package DemoJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoJenkins {
	public static WebDriver driver;
	@Test
	public void OpenApplication()
	{
		driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		System.out.println("welcome to My jenkins world");
		driver.close();
		System.out.println("hello aarya");
		
		driver.quit();
		//this is for my github project
		
		
	}

}
