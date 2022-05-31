package ro.ase.csie.cts.g1098.unit.testing.models;

import java.util.ArrayList;

import ro.ase.csie.cts.g1098.unit.testing.exceptions.AgeInvalidValueException;
import ro.ase.csie.cts.g1098.unit.testing.exceptions.NoGradesException;

public class Student {
	
	String name;
	int age;			//age between 13 and 90, without 13 ~ (13, 90]
	ArrayList<Integer> grades;
	
	public static final int MIN_AGE = 14;
	public static final int MAX_AGE = 90;
	
	
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
		}
		else {
			throw new AgeInvalidValueException();
		}
	}
	
	public ArrayList<Integer> getGrades() {
		return grades;
	}
	
	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
	}
	
	public int getMinGrade() {
		
		if(this.grades == null || this.grades.size() == 0)
			throw new NoGradesException();
		
		int min = this.grades.get(0);
		for(int grade : this.grades) {
			if(min > grade) {
				min = grade;
			}
		}
		
		return min;
	}
	
	public float getGradesAverage() {
		int sum = 0;
		for(int grade : this.grades) {
			sum += grade;
		}
		return sum / this.grades.size();
	}
	
}
