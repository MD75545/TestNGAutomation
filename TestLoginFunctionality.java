package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import PageObjectModel.LoginPage;
@Test

public class TestLoginFunctionality {
	public void TestLoginWithValidData() {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		LoginPage Login=new LoginPage(driver);
		Login.getUsername().sendKeys("Cristiano Ronaldo");
		Login.getPassword().sendKeys("Ronaldo@123");
		Login.getLogin().click();
	}
	
	
	
}
