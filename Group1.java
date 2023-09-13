package Grouping;

import org.testng.annotations.Test;

public class Group1 {
	@Test
	public void BrowzerLaunch() {
		
		
		System.out.println("This is launching method");
	}
	
	
	@Test(groups = {"Smoke"})
	public void LoginFunctionality() {
		
		System.out.println("This is LoginFunctionality method");
	}
	
	
	@Test(groups = {"Usablity","Smoke"})
	public void HomePageTitle() {
		
		
		System.out.println("This is HomePageTitle method");
	}
	
	
	@Test(groups = {"Usablity"})
	public void HomePageCurrentURL() {
		
		System.out.println("This is HomePageCurrentURL method");
	}
	
	@Test
	public void TearDown() {
		
		System.out.println("This is TearDown method");
	}
	
	@Test(groups = {"Regression"})
	public void RegressionMethod() {
		System.out.println("This is Regression Method");
	}
}
