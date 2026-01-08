package API.Web;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCasePageTestCase7 extends BaseClass{
	@Test
	public void page()
	{
		//Home page is displayed
		String home = driver.findElement(By.xpath("//a[text()=' Home']")).getText();
		System.out.println(home+" Page is displayed");
		driver.findElement(By.xpath("(//a[@href='/test_cases'])[1]")).click();
		String testCases = driver.findElement(By.xpath("//b[text()='Test Cases']")).getText();
		System.out.println(testCases+ " is displayed");
		driver.close();
	}

}
