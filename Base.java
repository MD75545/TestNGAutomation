package TestNg_FirstTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void Launching() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
