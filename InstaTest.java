package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InstaTest {
	public WebDriver driver;
	@Test
	public void instaLaunch() {
		driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
	}
	@Test(dependsOnMethods = {"instaLaunch"},groups = {"Regression"})
	public void instaElements() {
	driver.findElement(By.name("username")).sendKeys("Lio Messi");
	driver.findElement(By.name("password")).sendKeys("Lio kfhf");
	driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 "
			+ "x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek "
			+ "xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
   }
}
