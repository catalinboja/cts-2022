package ro.ase.csie.cts.g1098.unit.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1098.unit.testing.exceptions.AgeInvalidValueException;
import ro.ase.csie.cts.g1098.unit.testing.exceptions.NoGradesException;
import ro.ase.csie.cts.g1098.unit.testing.models.Student;

public class TestStudent {
	
	//test fixture
	public final static String initialName = "John Doe";
	public final static int initialAge = 20;
	public final static ArrayList<Integer> initialGrades= null;
	
	public static Student student;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(initialName, initialAge, initialGrades);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRightSetAge() {
		Student student = new Student(initialName, initialAge, initialGrades);
		int newAge = initialAge + 1;
		
		int expectedValue = newAge;
		
		student.setAge(newAge);
		
		int actualAge = student.getAge();
		
		assertEquals(expectedValue, actualAge);		
	}
	
	@Test
	public void testInverseRelationSetAge() {
		int newAge = initialAge + 1;
		
		student.setAge(newAge);
		
		assertNotEquals(initialAge, student.getAge());
		
	}
	
	@Test(expected = AgeInvalidValueException.class)
	public void testErrorConditionSetAge() {
		int negativeAge = -23;
		student.setAge(negativeAge);
	}
	
	@Test(expected = AgeInvalidValueException.class)
	public void testRangeMaxValue() {
		student.setAge(Integer.MAX_VALUE);
	}
	
	@Test(expected = AgeInvalidValueException.class)
	public void testRangeBigPositiveValue() {
		int bigPositiveValue = 120;
		student.setAge(bigPositiveValue);
	}
	
	@Test
	public void testSetAgeUpperBoundary() {
		int newAge = Student.MAX_AGE;
		int expectedAge = newAge;
		
		student.setAge(newAge);
		
		int actualAge = student.getAge();
		
		assertEquals(expectedAge, actualAge);	
	}
	
	@Test
	public void testSetAgeLowerBoundary() {
		int newAge = Student.MIN_AGE;
		int expectedAge = newAge;
		
		student.setAge(newAge);
		
		int actualAge = student.getAge();
		
		assertEquals(expectedAge, actualAge);	
	}
	
	@Test
	public void testGetMinGradeAscendingOrder() {
		ArrayList<Integer> grades = new ArrayList<>();
		for(int grade = 5; grade <= 10; grade+=1) {
			grades.add(grade);
		}
		
		int expectedMinGrade = 5;
		student.setGrades(grades);
		int minGrade = student.getMinGrade();		
		assertEquals(expectedMinGrade, minGrade);	
	}
	
	@Test(expected = NoGradesException.class)
	public void testGetMinGradeCardinalityZero() {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(grades);
		
		student.getMinGrade();
	}
	
	@Test(expected = NoGradesException.class)
	public void testGetMinGradeNullReference() {
		ArrayList<Integer> grades = null;
		student.setGrades(grades);
		
		student.getMinGrade();
	}
	
	@Test
	public void testGetMinGradeCardinalityOne() {
		ArrayList<Integer> grades = new ArrayList<>();
		int uniqueGrade = 10;
		grades.add(uniqueGrade);
		
		student.setGrades(grades);
		
		int minGrade = student.getMinGrade();
		
		assertEquals(uniqueGrade, minGrade);
	}

}
