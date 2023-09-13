package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class URLTesting {
public WebDriver driver;
	
	@Test
	public void FBLaunch() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void instaLaunch() {
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println(Thread.currentThread().getId());
	}
}
