package com.inti.firstJUnitProject;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionTest {
	protected Addition add;
	
	@Test
	public void test() throws Exception{
		String ch1 = null;
		String ch2 = new String("def");
		int val1 = 5;
		int val2 = 6;
		String[] expectedArray = {"one","two","three"};
		String[] resultArray = {"one","two","three"};
		//assertEquals(new Long(5), add.calculer(new Long(1), new Long(3)));
		//assertEquals(ch1, ch2);
		//assertTrue(val1 < val2);
		//assertFalse(val1>val2);
		//assertNull(ch1);
		//assertNotNull(ch1);
		assertArrayEquals(expectedArray, resultArray);
		System.out.println(" après le before");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}
	@Before
	public void setUp() {
		add = new Addition();
		System.out.println(" in before");
	}
	@After
	public void after() {
		System.out.println("in after");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println(" in after class");
	}
}
