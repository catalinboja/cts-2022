package ro.ase.cts.course.clean.code.solid.models;

public class OOPCourse implements CourseInterface{
	
	@Override
	public void takeExam(String studentName) {
		System.out.println(
				String.format("The student %s writes a program for the OOP exam", studentName));
	}

}
