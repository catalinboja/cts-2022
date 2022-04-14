package ro.ase.acs.cts.design.patterns.factory.method;

import ro.ase.acs.cts.documents.AbstractDocument;
import ro.ase.acs.cts.documents.DocType;
import ro.ase.acs.cts.documents.DocumentHtmlGeneric;
import ro.ase.acs.cts.documents.DocumentOpenOfficeText;

public class MsDocFactory extends AbstractDocFactory{

	public static final int DEFAULT_WORD_VERSION = 1;
	
	@Override
	public AbstractDocument getDocument(DocType docType, String docName) {
		switch(docType) {
		case WORD:
			return new DocumentOpenOfficeText(docName, DEFAULT_WORD_VERSION);
		default:
			throw new UnsupportedOperationException();
		}
	}
	
	

}
