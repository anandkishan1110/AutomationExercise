package API.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogoutUserTestCase4 {
	@Test
	public void logoutUser()
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
				//"anand1110@gmail.com",12345
				driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("anand1110@gmail.com");
				driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345");
				driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
				String loggedAs = driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
				System.out.println(loggedAs+ " is displayed");
				driver.findElement(By.xpath("//a[@href='/logout']")).click();
				System.out.println(newUserText+" is displayed");
				driver.close();
				
				
	}

}
