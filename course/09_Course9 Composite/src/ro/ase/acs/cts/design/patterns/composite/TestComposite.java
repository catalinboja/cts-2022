package ro.ase.acs.cts.design.patterns.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		//define a department
		InternalStructure departamentIT = 
				new InternalStructure("DepartamentIT", "IT Department");
		
		
		//define a composite node
		InternalStructure devTeam = 
				new InternalStructure("Dev team", "Programmers team");
		
		//add employees in team
		devTeam.addChildNode(new Employee("Popescu", "Software Eng"));
		devTeam.addChildNode(new Employee("Ionescu", "Software Eng"));
		
		//add child nodes
		departamentIT.addChildNode(new Employee("John", "Department Manager"));
		departamentIT.addChildNode(devTeam);
		
		//display structure
		System.out.println(departamentIT.getInfo());
		
	}
}
