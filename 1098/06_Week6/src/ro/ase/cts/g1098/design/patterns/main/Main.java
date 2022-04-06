package ro.ase.cts.g1098.design.patterns.main;

import java.io.IOException;

import ro.ase.cts.g1098.design.patterns.interfaces.ILogging;
import ro.ase.cts.g1098.design.patterns.models.LoggerGenerator;
import ro.ase.cts.g1098.design.patterns.models.LoggerType;

public class Main {

	public static void main(String[] args) throws IOException {
		
		ILogging errorLog = LoggerGenerator.getLogger(LoggerType.ERROR);
		errorLog.log("Hello !");
		
		
		//we have a bug
		// we can't have the singleton and the singleton registry in the same time
		// in 2 different classes
		ILogging infoLog = LoggerGenerator.getLogger(LoggerType.INFO);
		infoLog.log("Hello again!");
		
		System.out.println("The end");
		
	}

}
