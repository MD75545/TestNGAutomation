package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iterate {
public WebDriver driver;
	
	@Test(threadPoolSize = 4,invocationCount = 4)
	public void Name() {
		driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
	System.out.println(Thread.currentThread().getId());
	}
}
