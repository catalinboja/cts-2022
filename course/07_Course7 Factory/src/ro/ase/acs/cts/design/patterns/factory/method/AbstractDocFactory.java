package ro.ase.acs.cts.design.patterns.factory.method;

import ro.ase.acs.cts.documents.AbstractDocument;
import ro.ase.acs.cts.documents.DocType;

public abstract class AbstractDocFactory {
	public abstract AbstractDocument getDocument(
			DocType docType, String docName);
}
