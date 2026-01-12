package API.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VerifySubscriptionCartPageTestCase11  extends BaseClass{
	@Test
	public void cartPage()
	{
		driver.findElement(By.xpath("(//a[@href='/view_cart'])[1]")).click();
		WebElement element = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Kishan32@gmail.com");
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
		String msg = driver.findElement(By.xpath("//div[text()='You have been successfully subscribed!']")).getText();
		System.out.println(msg+" is displayed");
		driver.close();
	}

}
