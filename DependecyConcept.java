package Practise;

import org.testng.annotations.Test;

public class DependecyConcept {
	@Test
	public void Sumit() {
		System.out.println("SUMIT Movie");
	}

	@Test(dependsOnMethods = { "Sumit" })
	public void Ram() {
		System.out.println("Ram movie");
	}

	@Test(dependsOnMethods = { "Ram" })
	public void Sham() {
		System.out.println("Sham movie");
	}

	@Test(dependsOnMethods = { "Sham" })
	public void Ajenkiya() {
		System.out.println("Ajemkiya movie");
	}
}
