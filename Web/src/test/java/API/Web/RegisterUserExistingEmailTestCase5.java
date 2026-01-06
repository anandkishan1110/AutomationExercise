package API.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterUserExistingEmailTestCase5 {
	@Test
	public void existingEmail()
	{
		//open the window
		ChromeDriver driver=new ChromeDriver();
		//open url
		driver.get("http://automationexercise.com/");
		//maximize the window
		driver.manage().window().maximize();
		//Home page is displayed
		String home = driver.findElement(By.xpath("//a[text()=' Home']")).getText();
		System.out.println(home+" Page is displayed");
		//Click on signup/login
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		//Verify 'Login to your account' is visible 
		String newUserText = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();
		System.out.println(newUserText+" is displayed");
		//Enter already exisiting mail
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("kishan");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("kishan@playo.co");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		String text = driver.findElement(By.xpath("//p[text()='Email Address already exist!']")).getText();
		System.out.println(text);
		driver.close();
	}

}
