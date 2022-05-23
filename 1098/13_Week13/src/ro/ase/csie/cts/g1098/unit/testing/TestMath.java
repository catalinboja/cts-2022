package ro.ase.csie.cts.g1098.unit.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMath {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Preparing tests...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Cleaning up after tests");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Running a test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Cleaning after a test");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSuccess() {
		assertTrue(true);
	}
	
	
	@Test
	public void testMathAdd() throws Exception {
		//1. define the input values needed to execute the method
		int vb1 = 10;
		int vb2 = 20;
		//2. define the expected result
		int expectedResult = 30;
		
		//3. call the method that you want to test and get its result
		int result = Math.add(vb1, vb2);
		
		//4. check the results and mark the test with sucess/failure
//		if(result == expectedResult) {
//			System.out.println("It's ok");
//		}
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void testMathAddOverflow() {
		//1. define the input
		int vb1 = Integer.MAX_VALUE;
		int vb2 = 1;
		
		//2. expected result is an exception
		try {
			Math.add(vb1, vb2);
			fail("There is no exception for overflow");
		}
		catch(Exception ex) {
			assertTrue(true);
		}
	}
	
}
