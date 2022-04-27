package ro.ase.acs.cts.models.initial;

import java.util.ArrayList;

public class InternalStructure {

	ArrayList<Employee> elements = new ArrayList();
	ArrayList<InternalStructure> departments = new ArrayList();
	String structureName;
	String description;
	
	public InternalStructure(String structureName, String description){
		this.structureName = structureName;
		this.description = description;
	}
	
	public String getInfo(){
		StringBuffer sb = new StringBuffer();
		sb.append(structureName + " - "+ this.description);
		sb.append("\n");
		
		for(Employee employee : elements)
			sb.append("\t" + employee.getName());
		
		return sb.toString();
		
	}
	
	public void addEmployee(Employee employee){
		elements.add(employee);
	}
	
	public void deleteEmployee(Employee employee){
		elements.remove(employee);
	}
	
	public Employee getEmployee(int i){
		return (Employee)elements.get(i);
	}

}
