package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Provider {
	public WebDriver driver;

	@Test(dataProvider = "ContainerA")
	public void testcontainer(String username, String password, String Datatype) {
//		System.out.println("no value"+username+"password is "+password+"datatype is "+Datatype);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(password);
		driver.findElement(By.tagName("button")).click();

		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);

		String expectedTitle = "Log in to Facebook";
		System.out.println(expectedTitle);

		Assert.assertEquals(Actualtitle, expectedTitle);

		WebElement  Text = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String ActualText = Text.getText();
		System.out.println("Actual Result is ="+ActualText);
		
		String ExpectedText = "The//input[@class='_aa4b _add6 _ac4d'] email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		System.out.println(ExpectedText);

		SoftAssert soft=new SoftAssert();
		soft.assertEquals(ActualText, ExpectedText);
		soft.assertAll();

	}
//		if(expectedTitle.equals(title))
//		{
//			System.out.println("test case passed");
//		}
//		else {
//			System.out.println("test case failed");
//		}
//		}

	@DataProvider(name = "ContainerA")
	public Object[][] name() {
		return new Object[][] { { "&*()", "98ij", "invalid" } };

	}

}
