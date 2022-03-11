package ro.ase.cts.course.clean.code.solid.models;

public class Accounting {
	public void payTuition(String studentName) {
		System.out.println(
				String.format("The student %s pays 1000 RON as tuition fee", studentName));
	}
}
