package API.Web;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchProductTestCase9 extends BaseClass{
	@Test
	public void search()
	{
		        //Click on product
				driver.findElement(By.xpath("//a[@href='/products']")).click();
				//All product is visible
				String product = driver.findElement(By.xpath("//h2[text()='All Products']")).getText();
				System.out.println(product+" is visible");
				//Enter the product name in the search textfield
				driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Winter Top");
				driver.findElement(By.xpath("//button[@id='submit_search']")).click();
				String text = driver.findElement(By.xpath("//h2[text()='Searched Products']")).getText();
				System.out.println(text+ " is displayed");
				driver.close();
	}

}
