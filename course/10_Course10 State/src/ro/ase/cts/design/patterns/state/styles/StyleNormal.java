package ro.ase.cts.design.patterns.state.styles;

public class StyleNormal implements IPrintable{

	@Override
	public void print(String text) {
		System.out.println("Normal: "+text);
	}
}
