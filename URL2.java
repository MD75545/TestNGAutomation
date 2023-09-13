package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class URL2 {
public WebDriver driver;
		@Test
		public void OrangeHrm() {
			driver=new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println(Thread.currentThread().getId());
		}
}

