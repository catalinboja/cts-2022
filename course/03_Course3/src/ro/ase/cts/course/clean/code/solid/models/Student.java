package ro.ase.cts.course.clean.code.solid.models;

public class Student {
	
	private String name;
	private int age;
	
	Accounting accountingDep;
	CourseInterface oopCourse;
	UniversityDB universityDB;
	
	
	public Student() {
		super();
	}

	public Student(String name, int age, CourseInterface oopCourse) {
		super();
		this.name = name;
		this.age = age;
		this.oopCourse = oopCourse;
	}

	public void learn(String course) {
		System.out.println("The student attends the course " + course);
	}
	
	String getName(){
		return this.name;
	}
	public void payTuition(){ 
		//System.out.println("The student pays 1000 RON as tuition fee");
		
		if(this.accountingDep != null)
			this.accountingDep.payTuition(this.name);
		else
			throw new UnsupportedOperationException();
	}
	public void takeOOPExam(){
		if(this.oopCourse!= null) {
			this.oopCourse.takeExam(this.name);
		}
		else {
				throw new UnsupportedOperationException();
		}
	}
	
	
	public void saveToDB(){
		if(this.universityDB != null) {
			this.universityDB.saveStudentData(this);
		}
		else {
			throw new UnsupportedOperationException();
		}
	}
	
	
	
	public Accounting getAccountingDep() {
		return accountingDep;
	}

	public void setAccountingDep(Accounting accountingDep) {
		this.accountingDep = accountingDep;
	}

	public void setOopCourse(CourseInterface oopCourse) {
		this.oopCourse = oopCourse;
	}

	public void setUniversityDB(UniversityDB universityDB) {
		this.universityDB = universityDB;
	}
	
	

}
