package ro.ase.cts.design.patterns.initial;

public class DataCollection {
	protected int values[];

	
	public DataCollection(int n){
		values = new int[n];
		for(int i = 0;i<n;i++)
			values[i] = i+1;
	}
	
	public int processData(int option){
		switch(option) {
		case 1:
			//do sum
			return 0;
		case 2:
			//do average
			return 0;
		case 3:
			//do minimum
			return 0;
		default:
			throw new UnsupportedOperationException();
		}
	}
}
