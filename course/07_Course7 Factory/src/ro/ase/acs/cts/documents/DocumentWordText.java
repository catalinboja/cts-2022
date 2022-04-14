package ro.ase.acs.cts.documents;

public class DocumentWordText extends AbstractDocument {
	
	private int version;

	public DocumentWordText(String title, int version, 
			boolean hasMetaData, int compatibilityVersion) {
		this.setName(title);
		this.version = version;
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
