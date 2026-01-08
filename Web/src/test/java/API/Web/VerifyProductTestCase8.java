package API.Web;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class VerifyProductTestCase8 extends BaseClass{
	@Test
	public void products()
	{
		//Click on product
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		//All product is visible
		String product = driver.findElement(By.xpath("//h2[text()='All Products']")).getText();
		System.out.println(product+" is visible");
		//click on first product
		driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
		//Product Name
		String pName = driver.findElement(By.xpath("//div[@class='product-information']/descendant::h2")).getText();
		String pCategory = driver.findElement(By.xpath("(//div[@class='product-information']/descendant::p)[1]")).getText();
		String pAvail = driver.findElement(By.xpath("(//div[@class='product-information']/descendant::p)[2]")).getText();
		String pCondition = driver.findElement(By.xpath("(//div[@class='product-information']/descendant::p)[3]")).getText();
		String pBrand = driver.findElement(By.xpath("(//div[@class='product-information']/descendant::p)[4]")).getText();
		String pPrice = driver.findElement(By.xpath("(//div[@class='product-information']/descendant::span)[2]")).getText();
		
		System.out.println("Product Name:-" + pName + " Product Category:-"+ pCategory + " Availabilty:-"+pAvail + " Product Condition:-"+pCondition+" Product Brand:- "+pBrand+ "Product Price:-"+pPrice);
		driver.close();
				
	}

}
