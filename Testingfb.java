package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testingfb {
	public WebDriver driver;
	@Test
	public void ValidatelaunchBrowzer(){
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
	}
@Test(dependsOnMethods = {"ValidatelaunchBrowzer"})	
public void LoginTest(){
		driver.findElement(By.id("email")).sendKeys("78gyt7uig");
		driver.findElement(By.id("pass")).sendKeys("78gyt7uig");
		driver.findElement(By.tagName("button")).click();
	}
@Test(dependsOnMethods = {"LoginTest"})
public void ValidateErrormessage() {
	String obj=driver.findElement(By.className("_9ay7")).getText();
	System.out.println(obj);
}
}
