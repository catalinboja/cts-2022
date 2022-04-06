package ro.ase.acs.cts.documents.ms;

import ro.ase.acs.cts.documents.DocumentInterface;

public class DocumentWordText extends DocumentInterface {

	public DocumentWordText(String title, int vb) {
		this.setName(title);
	}
	
	@Override
	public String getType() {
		return "MSWord Document for text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
