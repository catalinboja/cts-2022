package ro.ase.cts.design.patterns.state;

import ro.ase.cts.design.patterns.state.styles.IPrintable;
import ro.ase.cts.design.patterns.state.styles.Style;
import ro.ase.cts.design.patterns.state.styles.StyleFirstWordBold;
import ro.ase.cts.design.patterns.state.styles.StyleItalic;
import ro.ase.cts.design.patterns.state.styles.StyleNormal;

public class Editor {
	//current state of the editor
	IPrintable currentState;
	
	public Editor(){
		currentState = new StyleNormal();
	}
	
	public void selectFirstWordBoldOption() {
		this.currentState = new StyleFirstWordBold(this);
	}
	
	public void selectItalicOption() {
		this.currentState = new StyleItalic();
	}
	
	
	public void resetPreferences() {
		this.currentState = new StyleNormal();
	}
	
	public void setStyle(Style style){
		if(style == Style.NORMAL)
			this.currentState = new StyleNormal();
		else
			if(style == Style.BOLD)
				this.currentState = new StyleFirstWordBold(this);
			else
				this.currentState = new StyleItalic();
	}
	
	public void print(String text){
		this.currentState.print(text);
	}

}
