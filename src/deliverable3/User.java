package deliverable3;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * As a user
 * I want to log into my account
 * so that I can review all my booking history
 * @author emma
 *
 */
public class User {
	static WebDriver driver = new HtmlUnitDriver();
	//Start at the home page for expedia
	
	@Before
	public void setUp() throws Exception{
		driver.get("http://www.expedia.com/");
	}
	
//	Given a correct username
//	And a correct password
//	When I try to log in with those credentials
//	Then I should be successfully logged into my account
	

//	@Test
//	public void testCorrectPassword(){
//		// Enter user name "emma_liu2000@163.com", password "123456asdfgh"
//		driver.findElement(By.id("header-account-menu")).click();
//		
//		driver.executeScript("arguments[0].checked = true;", WebElement);
//		driver.findElement(By.id("header-account-signin")).click();
//		//driver.findElement(By.id("signin-loginid")).click();
//		//driver.findElement(By.id("signin-loginid")).clear();
//		driver.findElement(By.id("signin-loginid")).sendKeys("emma_liu2000@163.com");
//		//driver.findElement(By.id("signin-password")).clear();
//		driver.findElement(By.id("signin-password")).sendKeys("123456asdfgh");
//		driver.findElement(By.id("submitButton")).click();
//			// WebElement loginPg = driver.findElement(By.);
//			// assertTrue(loginPg.isDisplayed());
//
//	}
	@Test
	public void testCorrectPassword(){
		driver.findElement(By.id("primary-header-flight")).click();
//		driver.findElement(By.id("flight-origin")).sendKeys("Pittsburgh, PA, United States (PIT-Pittsburgh Intl.)");
//		driver.findElement(By.id("flight-destination")).sendKeys("Seattle, WA, Unseaited States (SEA-Seattle - Tacoma Intl.)");
//		driver.findElement(By.id("flight-departing")).clear();
//		driver.findElement(By.id("flight-departing")).sendKeys("08/02/2015");
//		driver.findElement(By.id("flight-returning")).clear();
//		driver.findElement(By.id("flight-returning")).sendKeys("08/13/2015");
//		
//		driver.findElement(By.id("search-button")).click();

		WebElement e = driver.findElement(By.id(id))




	}



}
