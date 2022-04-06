package ro.ase.acs.cts.documents.open.office;

import ro.ase.acs.cts.documents.DocumentInterface;

public class DocumentOpenOfficeText extends DocumentInterface{

	
	public DocumentOpenOfficeText(String name) {
		this.setName(name);
	}
	
	@Override
	public String getType() {
		return "OpenOffice Document for text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
