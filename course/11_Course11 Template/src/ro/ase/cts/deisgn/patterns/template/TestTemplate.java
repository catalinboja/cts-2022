package ro.ase.cts.deisgn.patterns.template;

public class TestTemplate {

	public static void main(String[] args) {
		
		NUnitTesting nUnit = new NUnitTesting();
		JUnitTesting jUnit = new JUnitTesting();
		
		nUnit.test();
		jUnit.test();
	}

}
