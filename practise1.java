package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class practise1 {
	public WebDriver driver;
	@Test(dataProvider = "Container A")
	public void Data(String username,String password,String datatype) {
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		driver.findElement(By.tagName("button")).click();
		
		String Actual=driver.getTitle();
		System.out.println(Actual);
		
		String ExpectedTitle="Log in to Facebook";
		
		if(ExpectedTitle.equals(Actual))
		{
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
			
		}
		Assert.assertEquals(Actual, ExpectedTitle);
	}
	  @Test(dataProvider = "Container A")
		public void testcontainer(String username, String password, String Datatype) {
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(username);
			WebElement pass = driver.findElement(By.id("pass"));
			pass.sendKeys(password);
			driver.findElement(By.tagName("button")).click();
			
			WebElement ActualText=driver.findElement(By.xpath("//div[@class='_9ay7']"));
			System.out.println(ActualText);
			String ExpectedTitle="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
			System.out.println(ExpectedTitle);
			
			SoftAssert soft=new SoftAssert();
			soft.assertEquals(ActualText, ExpectedTitle);
			soft.assertAll();
	

		
	}
	
	
	@DataProvider(name= "Container A")
	public Object[][] ronny(){
		return new Object[][] {{"&^*","8y8iu","invalid"}};
		
	}

}
