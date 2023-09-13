package Paramater;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserSum {
	@Test
	@Parameters({"ram","sham"})
	public void sum(int a,int b) {
		int c;
		c=a+b;
		System.out.println(c);
	}

}
