package ro.ase.csie.cts.g1098.unit.testing;

public class Math {
	
	public static int add(int a, int b) throws Exception {
		if(Integer.MAX_VALUE - b < a)
			throw new Exception("Overflow");
		return a+b;
	}
	
}
