package API.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IncorrectLoginTestCase3 {
	@Test
	public void incorrectLogin()
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
		String newUserText = driver.findElement(By.xpath("//h2[text()='Login to your account']")).getText();
		System.out.println(newUserText+" is displayed");
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("Kumar@gamil.co");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("KJ");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		String invalidText = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).getText();
		System.out.println(invalidText);
		driver.close();
	}

}
