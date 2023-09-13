package TestNg_FirstTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	public WebDriver driver;
	@Test
	public void ValidateErrorMessage() {
		
		 driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Cristiano Ronaldo");
		driver.findElement(By.id("pass")).sendKeys("Ronaldo@123");
		driver.findElement(By.tagName("Button")).click();
		
	}
	@Test
	public void VerifyLoginFunctionality() {
		WebElement obj=driver.findElement(By.xpath("//div[@class='_9ay7']"));
		obj.getText();
		
	}
	}
	

