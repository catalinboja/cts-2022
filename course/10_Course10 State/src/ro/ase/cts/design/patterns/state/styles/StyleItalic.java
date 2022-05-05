package ro.ase.cts.design.patterns.state.styles;

public class StyleItalic implements IPrintable{
	public void print(String text) {
		System.out.println("Italic: "+text);
	}
}
