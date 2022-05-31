package ro.ase.csie.cts.course.models.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.course.exceptions.InvalidAgeValueException;
import ro.ase.csie.cts.course.models.Student;

public class TestStudent {
	
	static Student student = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Starting testing methods");	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Cleaning after all tests");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Preparing a test");
		
		student = new Student("",23, null);
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
	public void testSetName() {
		//1. Choose the input values for the tested method
		String newStudentName = "John";
		//2. Define the expected result
		String expectedStudentName = newStudentName;
		
		//3. Call the method
		Student student = new Student("",23, null);
		student.setName(newStudentName);
		
		//4. Check results
		String studentActualName = student.getName();
		
		assertEquals(expectedStudentName, studentActualName);	
		
	}
	
	@Test
	public void testSetAgeConformance() {
		int newAge = 20;
		int expectedAge = 20;
		
		student.setAge(newAge);
		
		assertEquals(expectedAge, student.getAge());
	}
	
	@Test
	public void testGetAverageAscendingOrder() {
		//test with sorted grades	
		ArrayList<Integer> grades = new ArrayList<>();
		for(int i = 7; i <= 10; i++) {
			grades.add(i);
		}
		grades.add(3);
		student.setGrades(grades);
		
		float expectedAverage = (float) 7.4;
		
		float actualAverage = student.getGradesAverage();
		
		assertEquals(expectedAverage, actualAverage,0.01);
	}
	
	@Test
	public void testSetAgeRangeZeroValue() {
		int newAge = 0;
		
		try{
			student.setAge(newAge);
			fail("No exception");
		}
		catch(InvalidAgeValueException e) {
			assertTrue(true);
		}	
	}
	
	@Test(expected = InvalidAgeValueException.class)
	public void testSetAgeValueAboveLimit() {
		int newAge = 200;
		student.setAge(newAge);
	}

}
