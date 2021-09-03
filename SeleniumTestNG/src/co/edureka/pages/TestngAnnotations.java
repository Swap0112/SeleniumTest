package co.edureka.pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	
	
	@BeforeMethod

	public void beforeMethod() {
		
		System.out.println("Before the method");
		
	}
	
    @BeforeClass
	
	public void beforeClass() {
		
		System.out.println("Before the class");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("After class");
	}
	
	@Test
	public void afterMethod() {
		
		System.out.println("After method");
		
	}
}

