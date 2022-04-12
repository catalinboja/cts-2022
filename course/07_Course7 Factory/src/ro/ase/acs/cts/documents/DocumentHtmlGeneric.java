package ro.ase.acs.cts.documents;

import ro.ase.acs.cts.documents.interfaces.DocumentInterface;

public class DocumentHtmlGeneric extends DocumentInterface{

	boolean hasHeader;
		
	public DocumentHtmlGeneric(boolean hasHeader) {
		this.hasHeader = hasHeader;
	}

	@Override
	public String getType() {
		return "HTML Document";
	}

	@Override
	public void print(String text) {
		System.out.println("<p>"+text+"</p>");
	}

}
