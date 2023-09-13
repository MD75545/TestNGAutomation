package Practise;

import org.testng.annotations.Test;

public class Groups {
	@Test
	public void Sumit() {
		System.out.println("SUMIT Movie");
	}

	@Test(dependsOnMethods = { "Sumit" },dependsOnGroups = {"Regression"})
	public void Ram() {
		System.out.println("Ram movie");
	}

	@Test(dependsOnMethods = { "Ram" })
	public void Sham() {
		System.out.println("Sham movie");
	}

	@Test(dependsOnMethods = { "Sham" },dependsOnGroups = {"smoke"})
	public void Ajenkiya() {
		System.out.println("Ajemkiya movie");
	}
	@Test(groups = { "smoke" })
	public void Pankaj() {
		System.out.println("Pankaj movie");
	}
	
	@Test(groups = { "smoke" })
	public void Pratik() {
		System.out.println("Pratik movie");
	}
	
	@Test(groups = { "smoke" })
	public void vinit() {
		System.out.println("Pankaj movie");
	}
	
	@Test(groups = { "Regression" })
	public void PRASHANT() {
		System.out.println("PRASHANT movie");
	}
	
	@Test(groups = { "Regression" })
	public void HARISH() {
		System.out.println("HARISH movie");
}
}
