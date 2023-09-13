package TestNg_FirstTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestFb extends Base {
	@Test
	public void test() {
	driver.findElement(By.tagName("button")).click();
	}
	@Test
	
	public void message() {
		System.out.println("Test case is running");
	}
}
