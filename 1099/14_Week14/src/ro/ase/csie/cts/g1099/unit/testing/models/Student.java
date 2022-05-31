package ro.ase.csie.cts.g1099.unit.testing.models;

import java.util.ArrayList;

import ro.ase.csie.cts.g1099.unit.testing.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1099.unit.testing.exceptions.NoGradesException;

public class Student {
	
	public static final int MIN_AGE = 14;
	public static final int MAX_AGE = 90;
	public static final int MIN_NAME_LENGHT = 3;
	public static final int MAX_NAME_LENGTH = 255;
	
	//at least 3 characters, maximum 255
	private String name;
	// value between (13, 90]
	private int age;
	ArrayList<Integer> grades;
	
	public Student(String name, int age, ArrayList<Integer> grades) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setGrades(grades);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= MIN_AGE && age <= MAX_AGE) {
			this.age = age; 
		} else {
			throw new InvalidAgeException();
		}	
	}
	public ArrayList<Integer> getGrades() {
		return grades;
	}
	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	
	public int getMinGrade() {
		
		if(this.grades == null || this.grades.size() == 0) {
			throw new NoGradesException();
		}
		
		int minGrade = this.grades.get(0);
		for(int grade : this.grades) {
			if(minGrade > grade) {
				minGrade = grade;
			}
		}
		return minGrade;
	}
	
	
	
	
}
