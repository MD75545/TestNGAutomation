package TestNg_FirstTestCase;

import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Practise_1 {
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
	 
	 public void myMessage() {
		 System.out.println("Welcome");
	 }
}
