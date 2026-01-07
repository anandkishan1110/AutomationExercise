package API.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	protected WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://automationexercise.com/");
		driver.manage().window().maximize();
		//Home page is displayed
		String home = driver.findElement(By.xpath("//a[text()=' Home']")).getText();
		System.out.println(home+" Page is displayed");
	}

}
