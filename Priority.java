package Prioritization;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 2)
	public void TestA() {

	}
	@Test
	public void TestB() {

	}
	@Test(priority = -1)
	public void TestC() {

	}
	
	@Test(priority = -3)
	public void TestD() {

	}
}
