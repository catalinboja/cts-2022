package ro.ase.cts.course.clean.code.solid.main;

import ro.ase.cts.course.clean.code.solid.models.OOPCourse;
import ro.ase.cts.course.clean.code.solid.models.OOPJavaCourse;
import ro.ase.cts.course.clean.code.solid.models.Student;
import ro.ase.cts.course.clean.code.solid.models.liskov.GeometricalModel;
import ro.ase.cts.course.clean.code.solid.models.liskov.Square;
import ro.ase.cts.course.clean.code.solid.models.liskov.Rectangle;

public class Main {
	
	public static double readAndAdd2Numbers() {
	
		double a = 0;
		double b = 0;
		
		//1 .read a and b from console
		
		//2 . do the addition
		double result = a + b;
		
		return a + b;
		
	}
	
	public static double readValueFromConsole() {
		return 0;
	}
	
	public static double add2Numbers(double a, double b) {
		return a + b;
	}
	

	public static void main(String[] args) {

		//Liskov Principle
		
		GeometricalModel figure = new Square();
		//GeometricalModel figure = new Rectangle();
		
		figure.getPerimeter();
		
		
		//DIP
		Student student = new Student();
		student.setOopCourse(new OOPCourse());
		student.takeOOPExam();
		
		student.setOopCourse(new OOPJavaCourse());
		student.takeOOPExam();
		
		
	}

}
