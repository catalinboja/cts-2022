package ro.ase.cts.design.patterns.strategy;

import ro.ase.cts.design.patterns.strategy.strategies.AverageEntity;
import ro.ase.cts.design.patterns.strategy.strategies.IProcessable;
import ro.ase.cts.design.patterns.strategy.strategies.SumEntity;

public class TestStrategy {
	
	public static void main(String[] args){
	
		DataCollection values = new DataCollection(10);
	
		SumEntity sum = new SumEntity();
		AverageEntity average = new AverageEntity();
	
		//compute sum
		values.setStrategy(sum);
		System.out.println(
				"Result is "+values.processData());
		
		//compute average
		values.setStrategy(average);
		System.out.println(
				"Result is "+values.processData());
		
		//define a local strategy
		values.setStrategy(new IProcessable() {
			@Override
			public int processData(int[] valori) {
				return 0;
			}
		});
		System.out.println(
				"Result is "+values.processData());
	
	}
}
