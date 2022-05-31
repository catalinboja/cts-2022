package ro.ase.csie.cts.g1099.unit.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1099.unit.testing.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1099.unit.testing.exceptions.NoGradesException;
import ro.ase.csie.cts.g1099.unit.testing.models.Student;

public class TestStudent {
	
	public static Student student;
	private static final String INITIAL_NAME = "John Doe";
	private static final int INITIAL_AGE = Student.MIN_AGE + 5;
	private static final ArrayList<Integer> INITIAL_GRADES = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(INITIAL_NAME, INITIAL_AGE, INITIAL_GRADES);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetAgeConformance() {
		//int newAge = 25;
		int newAge = Student.MIN_AGE + 1;
		int expectedAge = newAge;
		
		student.setAge(newAge);
		
		int actualAge = student.getAge();
		
		assertEquals(expectedAge, actualAge);
	}
	
	@Test
	public void testSetNameRight() {
		String newName = "Alice";
		student.setName(newName);
		assertEquals(newName, student.getName());
	}
	
	@Test
	public void testSetAgeInverseRelation() {
		int newAge = INITIAL_AGE + 1;
		student.setAge(newAge);
		
		assertNotEquals(INITIAL_AGE, student.getAge());	
	}
	
	@Test(expected = InvalidAgeException.class)
	public void testSetAgeErrorCondition() {
		int newAge = -10;
		student.setAge(newAge);
	}
	
	@Test(expected = InvalidAgeException.class)
	public void testSetAgeRangeMaxValue() {
		int newAge = Integer.MAX_VALUE;
		student.setAge(newAge);
	}
	
	@Test(expected = InvalidAgeException.class)
	public void testSetAgeRangeZero() {
		int newAge = 0;
		student.setAge(newAge);
	}
	
	@Test
	public void testSetAgeLowerBoundary() {
		int newAge = Student.MIN_AGE;
		student.setAge(newAge);
		
		assertEquals(newAge, student.getAge());
	}
	
	@Test
	public void testSetAgeUpperBoundary() {
		int newAge = Student.MAX_AGE;
		student.setAge(newAge);
		
		assertEquals(newAge, student.getAge());
	}
	
	@Test
	public void testGetMinGradeOrderingAscending() {
		ArrayList<Integer> grades = new ArrayList<>();
		for(int grade = 5; grade <= 10; grade +=1 ) {
			grades.add(grade);
		}
		student.setGrades(grades);
		
		int expectedMinGrade = 5;
		int actualMinGrade = student.getMinGrade();
		
		assertEquals(expectedMinGrade, actualMinGrade);
	}
	
	@Test(expected = NoGradesException.class)
	public void testGetMinGradeCardinalityZero() {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(grades);
		
		student.getMinGrade();
		
	}
	
	@Test
	public void testGetMinGradeCardinalityOne() {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(10);
		
		student.setGrades(grades);
		
		int expectedMinGrade = 10;
		int actualMinGrade = student.getMinGrade();
		
		assertEquals(expectedMinGrade, actualMinGrade);
	}
	
	@Test(expected = NoGradesException.class)
	public void testGetMinGradeExistenceNullReference() {
		ArrayList<Integer> grades = null;
		student.setGrades(grades);
		
		student.getMinGrade();
	}

}
