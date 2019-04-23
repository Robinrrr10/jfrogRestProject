package com.github.robinrrr10.main;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AppTest {
	
	App app = new App();
	
	@Test
	public void testOne() {
		System.out.println("Staring test one");
		Assert.assertEquals(app.getOne(), 1);
		System.out.println("Ending test one");
	}
	
	@Test
	public void testTrue() {
		System.out.println("Staring test two");
		Assert.assertTrue(app.getTrue());
		System.out.println("Ending test one");
	}
	
	@Test
	public void testOneAndTwo() {
		System.out.println("Staring test three");
		Assert.assertEquals(app.getOne(), 1);
		Assert.assertTrue(app.getTrue());
		System.out.println("Ending test three");
	}
}