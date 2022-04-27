package ro.ase.acs.cts.design.patterns.composite;

import java.util.ArrayList;

public class InternalStructure extends HierarchyNode{

	ArrayList<HierarchyNode> elements = new ArrayList();
	String structureName;
	String description;
	
	public InternalStructure(String structureName, String description){
		this.structureName = structureName;
		this.description = description;
	}
	
	@Override
	public String getName() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getPosition() {
		throw new UnsupportedOperationException();
	}

	@Override
	public double getSalary() {
		double salarySum = 0;
		for(HierarchyNode node : elements) {
			salarySum += node.getSalary();
		}
		return salarySum;
	}
	
	@Override
	public String getInfo(){
		StringBuffer sb = new StringBuffer();
		sb.append(structureName + " - "+ this.description);
		sb.append("\n");
		
		for(HierarchyNode node : elements)
			sb.append("\t" + node.getInfo());
		
		return sb.toString();
		
	}
	
	@Override
	public void addChildNode(HierarchyNode elementStructura){
		elements.add(elementStructura);
	}
	
	@Override
	public void deleteChildNode(HierarchyNode elementStructura){
		elements.remove(elementStructura);
	}
	
	@Override
	public HierarchyNode getChildNode(int i){
		return (HierarchyNode)elements.get(i);
	}

}
