package deliverable3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * As a user who wants to post a sale
 * I want to create an account
 * so that I can post some advertisement
 * @author emma
 *
 */
public class Post {
	
	static WebDriver driver = new HtmlUnitDriver();
	
	// Start at the Pittsburgh craigslist homepage for each test
	@Before
	public void setUp() throws Exception{
		driver.get("http://pittsburgh.craigslist.org/");
	}
	
//	Scenario 1: 
//	Given I’m on the Pittsburgh Craigslist apartment/housing rental page
//	When I click the account button
//	Then I should be directed to the account sign-in and creation page
	
	
		
	@Test 
	public void testEmailaddress(){
		
		driver.findElement(By.linkText("account")).click();
		driver.findElement(By.id("emailAddress")).sendKeys("emma_liu2000@163.com");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		//WebElement f = driver.findElement(By.xpath("html/body/h3"));
		

//		driver.findElement(By.id("inputEmailHandle")).sendKeys("emma_liu2000@163.com");
//		driver.findElement(By.id("inputPassword")).sendKeys("123456asdfgh");
		



		
		//Enter email address "emma_liu2000@163.com"
	
			
//		driver.findElement(By.id("emailAddress")).sendKeys("emma_liu2000@163.com");
//		WebElement e = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		e.click();
//		String s = e.getText();
//		assertTrue(s.contains("emma_liu2000@163.com"));
		
		

		
	}

}
