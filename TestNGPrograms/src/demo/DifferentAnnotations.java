package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentAnnotations {
	@BeforeMethod
public void beforeMethod() {
		System.out.println("@BeforeMethod execute before every @Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("@afterMethod execute after every @Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass will always execute prior to @beforeMethod and @Test");
	}
	@AfterClass 
	public void afterClass() {
		System.out.println("@afterClass will always execute after @afterMethod and @Test");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest will always execute prior to @beforeClass, @beforeMethod and @Test");
	}
	@AfterTest 
	public void afterTest() {
		System.out.println("@AfterTest will always execute after to @afterclass, @afterMethod and @Test");
	}
	
	@BeforeSuite 
	public void beforeSuite() {
		System.out.println("@BeforeSuite will always execute prior to all annotations or Test in the suite");
	}
	@AfterSuite 
	public void afterSuite() {
		System.out.println("@AfterSuite will always execute after all the annotatitions or Tests in the suite");
	}
	
	@Test
	public void testCase1() {
		System.out.println("Inside test case 1");
	}
		
	public void testCase2() {
		System.out.println("Inside Test Case 2");
	}
	

}
