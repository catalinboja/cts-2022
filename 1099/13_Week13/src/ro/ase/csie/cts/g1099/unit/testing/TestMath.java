package ro.ase.csie.cts.g1099.unit.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMath {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testWithSuccess() {
		assertTrue(true);
	}
	
	@Test
	public void testAdd() throws Exception {
		//1. define the input values required by the tested method
		int vb1 = 10;
		int vb2 = 20;
		
		//2. define the expected output for the previous imput
		int expectedResult = 30;
		
		//3. call the method - test it and save the result
		int result = Math.add(vb1, vb2);
		
		//4. check results
		assertEquals(expectedResult, result);	
	}
	
	@Test
	public void testAddOverflow() {
		int vb1 = Integer.MAX_VALUE;
		int vb2 = 1;
		
		try {
			Math.add(vb1, vb2);
			fail("We didn't got the exception for overflow");
		}
		catch(Exception e) {
			assertTrue(true);
		}
	}
	
	
	

}
