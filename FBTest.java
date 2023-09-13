package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FBTest {
	public WebDriver driver;
	
	@Test
	public void FBLaunch() {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dependsOnMethods = {"FBLaunch"},groups = {"Smoke"})
	public void FBElements(){
		driver.findElement(By.id("email")).sendKeys(" Cristiano Ronaldo");
		driver.findElement(By.id("pass")).sendKeys(" cr787tet Ronaldo");
		driver.findElement(By.tagName("button")).click();

	}
	
	
}
