package Practise;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import TestNg_FirstTestCase.Base;

public class MethodTesting extends Base {
	
		@Test
		public void FirstCase() {
		driver.findElement(By.tagName("button")).click();
		}
		@Test
		public void SecondCase() {
			driver.findElement(By.id("email")).sendKeys("Cristiano Ronaldo");
			driver.findElement(By.id("pass")).sendKeys("ronaldo");
			
		}

}
