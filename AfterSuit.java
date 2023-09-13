package TestNg_FirstTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AfterSuit {
	public WebDriver driver;
	@Test
	
	public void FBLogin() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.tagName("button")).click();
	}
	 @Test
	public void InstaLogin() {
		driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		String title=driver.getTitle();
		System.out.println(title);
}
	 @AfterSuite
	 public void myMessage() {
		 System.out.println("Welcome");
	 }

}
