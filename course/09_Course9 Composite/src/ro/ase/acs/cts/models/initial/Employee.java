package ro.ase.acs.cts.models.initial;

public class Employee {
	
	String name;
	String position;
	double salary;
	
	public Employee(String name, String position){
		this.name = name;
		this.position = position;
	}
	
	public void setSalary(double value){
		this.salary = value;
	}

	public String getName() {
		return this.name;
	}

	public String getPosition() {
		return this.position;
	}

	public double getSalary() {
		return this.salary;
	}
}
