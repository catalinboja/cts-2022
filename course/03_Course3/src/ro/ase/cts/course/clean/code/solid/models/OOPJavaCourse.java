package ro.ase.cts.course.clean.code.solid.models;

public class OOPJavaCourse implements CourseInterface {

	@Override
	public void takeExam(String studentName) {
		
		System.out.println(
				String.format("The student %s writes a Java program for the OOP Java exam", studentName));
		
	}

}
