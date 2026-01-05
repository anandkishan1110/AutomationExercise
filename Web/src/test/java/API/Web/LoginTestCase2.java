package API.Web;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LoginTestCase2 {
	public String fname="Kumar";
	public String lname="Ranga";
	Random r=new Random();
	@Test
	public void createUser()
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
				//Verify 'New User Signup!' is visible 
				String newUserText = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();
				System.out.println(newUserText+" is displayed");
				
				//Enter the name and email address
				driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(fname+ " "+lname);
				driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys("kumar"+r.nextInt()+"@gmail.com");
				
				
				//getText for userName
				String userName = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).getAttribute("value");
				
				
				
				//click on signup button
				driver.findElement(By.xpath("//button[text()='Signup']")).click();
				//Enter Account Information text should be displayed
				driver.findElement(By.xpath("//b[text()='Enter Account Information']")).getText();
				
				//Fill details: Title, Name, Email, Password, Date of birth 
				driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
				WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
				element.clear();
				element.sendKeys("Kumar Ranga");
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
				
				//Capture the password
				String pwd = driver.findElement(By.xpath("//input[@id='password']")).getAttribute("value");
				
				
				WebElement dropdownDay = driver.findElement(By.xpath("//select[@id='days']"));
				Select sday=new Select(dropdownDay);
				sday.selectByValue("11");
				
				WebElement dropdownMonths = driver.findElement(By.xpath("//select[@id='months']"));
				Select smonths=new Select(dropdownMonths);
				smonths.selectByValue("9");
				
				WebElement dropDownyear=driver.findElement(By.xpath("//select[@id='years']"));
				Select syear=new Select(dropDownyear);
				syear.selectByValue("1999");
				
				//Select checkbox 'Sign up for our newsletter!'
				driver.findElement(By.xpath("//input[@id='newsletter']")).click();
				
				
				//Select checkbox 'Receive special offers from our partners!'
				driver.findElement(By.xpath("//input[@id='optin']")).click();
				
				//Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number 
				driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(fname);
				driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lname);
				driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Indiranagar");
				driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Koramangala");
				WebElement elementCountry = driver.findElement(By.xpath("//select[@id='country']"));
				Select sCountry=new Select(elementCountry);
				sCountry.selectByValue("India");
				driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Karnataka");
				driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bengaluru");
				driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("560068");
				driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("7474747474");
				
				
				//Click 'Create Account button'
				driver.findElement(By.xpath("//button[text()='Create Account']")).click();
				
				//Verify that 'ACCOUNT CREATED!' is visible 
				String accountCreated = driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();
				System.out.println(accountCreated +" is displayed");
				
				// Click 'Continue' button
				driver.findElement(By.xpath("//a[text()='Continue']")).click();
				
				//Verify that 'Logged in as username' is visible 
				String loggedAs = driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
				System.out.println(loggedAs+ " is displayed");
				
				//Click on logout
				driver.findElement(By.xpath("//a[@href='/logout']")).click();
				
				//Login to your account is showing
				String loginText = driver.findElement(By.xpath("//h2[text()='Login to your account']")).getText();
				System.out.println(loginText+ "is displayed");
				
				//Enter username and pwd
				driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(userName);
				driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys(pwd);
				
				//click on login
				driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
				
				
				//Verify that 'Logged in as username' is visible 
				//Verify that 'Logged in as username' is visible 
				String loggedAs1 = driver.findElement(By.xpath("//a[text()=' Logged in as ']")).getText();
				System.out.println(loggedAs1+ " is displayed");
				
				
	}
	
	

}
