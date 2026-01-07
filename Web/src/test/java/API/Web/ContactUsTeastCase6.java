package API.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ContactUsTeastCase6 extends BaseClass {
	@Test
	public void contactUs()
	{
		//Click on 'Contact Us' button 
		driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
		//Verify 'GET IN TOUCH' is visible 
		String getInCont = driver.findElement(By.xpath("//h2[text()='Get In Touch']")).getText();
		System.out.println(getInCont+" is displayed");
		//Enter name, email, subject and message
		driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys("Kishan");
		driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("kishan@playo.co");
		driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys("Testing Auto");
		driver.findElement(By.xpath("//textarea[@data-qa='message']")).sendKeys("Okay");
		//Upload file
		String filepath="/Users/kishananand/Desktop/Screenshot.png";
		WebElement file = driver.findElement(By.xpath("//input[@name='upload_file']"));
		file.sendKeys(filepath);
		//Click 'Submit' button
		driver.findElement(By.xpath("//input[@data-qa='submit-button']")).click();
        //Click OK button 
		driver.switchTo().alert().accept();
		//Verify success message 'Success! Your details have been submitted successfully.' is visible 
		String success = driver.findElement(By.xpath("(//div[text()='Success! Your details have been submitted successfully.'])[1]")).getText();
		System.out.println(success+" is displayed");
		driver.findElement(By.xpath("//span[text()=' Home']")).click();
		//Home page is displayed
		String home = driver.findElement(By.xpath("//a[text()=' Home']")).getText();
		System.out.println(home+" Page is displayed");
		driver.close();
	}

}
