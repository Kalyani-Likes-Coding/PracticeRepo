package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	/*
	 * @BeforeMethod
	 * 
	 * @Test 1
	 * 
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * 
	 * @Test 2
	 * 
	 * @AfterMethod
	 * 
	 */

	// preconditions annotations -- starting with @Before //1
	@BeforeSuite
	public void setUp() {
		System.out.println("setUp");
	}

	@BeforeClass
	public void login() {

		System.out.println("login");
	}

	@BeforeMethod
	public void enterUrl() {

		System.out.println("enterUrl");

	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launchBrowser");

	}

	// test cases-- starting with @Test
	@Test(priority = 0)
	public void googleTitleTest() {

		System.out.println("googleTitleTest");
	}

	@Test(priority = 1)
	public void searchTest() {

		System.out.println("searchTest");
	}

	@Test(priority = 2)
	public void googleLogoTest() {
		System.out.println("googleLogoTest");
	}

	@AfterMethod
	public void logOut() {
		System.out.println("log out of app");
	}

	@AfterTest
	public void deleteAllCookies() {

		System.out.println("Deleting All cookies");
	}

	// Post conditions -- starting with @AFter annotation
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}

	@AfterSuite
	public void generateTestReport() {

		System.out.println("generate test report");
	}

}
