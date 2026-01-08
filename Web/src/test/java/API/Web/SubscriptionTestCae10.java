package API.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class SubscriptionTestCae10 extends BaseClass{
	@Test
	public void subscription()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		String subscription = driver.findElement(By.xpath("//h2[text()='Subscription']")).getText();
		System.out.println(subscription);
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("Kishan@playo.co");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();
		driver.close();
	}

}
