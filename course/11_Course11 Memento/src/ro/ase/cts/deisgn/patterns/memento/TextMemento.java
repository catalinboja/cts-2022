package ro.ase.cts.deisgn.patterns.memento;

import java.util.Date;

// Memento

public class TextMemento {
    private final String text;
    private Date timeStamp;
    
    public TextMemento(String textDeSalvat) {
    	text = textDeSalvat;
    	timeStamp = new Date();
    }

    public String getVersionContent() {
        return text;
    }
}
