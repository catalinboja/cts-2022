package ro.ase.acs.cts.documents;

public class DocumentHtmlGeneric extends AbstractDocument{

	boolean hasHeader;
		
	public DocumentHtmlGeneric(String name, boolean hasHeader) {
		this.name = name;
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
