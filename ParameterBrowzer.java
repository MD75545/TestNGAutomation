package Paramater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterBrowzer {
public WebDriver driver;
	
	@Test
	@Parameters({"Ram"})
	public void FBLaunch(String Browzer) {
		if(Browzer.equals("Chrome")) {
			driver=new ChromeDriver();
			System.out.println(Thread.currentThread().getId());
		}
		else if(Browzer.equals("Edge")) {
			driver=new EdgeDriver();
			System.out.println(Thread.currentThread().getId());
		}
	}
		
}
