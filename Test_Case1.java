package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case1 {
	public WebDriver driver;
	@Test
	public void before() {
		System.out.println("Test case is before running");
		
		
	}
	 @Test
	public void after() {
		System.out.println("Test case is after running");
		
	}
	@BeforeTest
	public void beforeTest() {
		driver.findElement(By.tagName("button")).click();
	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("Driver is running");
	}
	@AfterSuite
	public void AfterTestSuit() {
		System.out.println("After test suit is running");
	}
	@BeforeSuite
	public void BeforeTestSuit() throws InterruptedException {
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("David bekham is on!");
	}
	@BeforeClass
	public void Beforeclass() {
		String obj=driver.getTitle();
		System.out.println(obj);
	}
}
