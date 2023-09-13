package Paramater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FBParamaters {
public WebDriver driver;
	
	@Test
	@Parameters({"username","password","n"})
	public void FBLaunch(String username,String password,String n) {
		System.out.println(n);
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
}
}
