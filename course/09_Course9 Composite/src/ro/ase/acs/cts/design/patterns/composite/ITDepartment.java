package ro.ase.acs.cts.design.patterns.composite;

public class ITDepartment {
	//the root node
	InternalStructure structure;
	
	public ITDepartment(InternalStructure department){
		this.structure = department;
	}
}
