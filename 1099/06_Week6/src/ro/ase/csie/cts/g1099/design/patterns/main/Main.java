package ro.ase.csie.cts.g1099.design.patterns.main;

import java.io.IOException;

import ro.ase.csie.cts.g1099.design.patterns.exceptions.InvalidArgumentException;
import ro.ase.csie.cts.g1099.design.patterns.models.Logger;
import ro.ase.csie.cts.g1099.design.patterns.models.LoggerGenerator;
import ro.ase.csie.cts.g1099.design.patterns.models.LoggerType;
import ro.ase.csie.cts.g1099.design.patterns.models.singleton.registry.LoggerSingleton;

public class Main {

	public static void main(String[] args) throws InvalidArgumentException, IOException {
		
//		Logger logger = new Logger("info.log","<Info>");
//		logger.log("Hello");
		
		
//		Logger logger = Logger.getLogger("info.log", "<Singleton>");
//		logger.log("Hello again");
//		
//		Logger errorLogger = Logger.getLogger("error.log", "*Error*");
//		errorLogger.log("Error");
		
		
		//version 1 - the same principle but without the pattern
		Logger logger = (Logger) LoggerGenerator.getLogger(LoggerType.ERROR);
		logger.log("Testing the singleton registry");
		
		Logger logger2 = (Logger) LoggerGenerator.getLogger(LoggerType.ERROR);
		logger.log("Testing the singleton registry");
		
		Logger infoLogger = (Logger) LoggerGenerator.getLogger(LoggerType.INFO);
		infoLogger.log("Testing info");
		
		//version 2 - the Singleton registry pattern
		LoggerSingleton info = LoggerSingleton.getLogger(LoggerType.INFO);
		info.log("An info message");
		
		LoggerSingleton error = LoggerSingleton.getLogger(LoggerType.ERROR);
		error.log("An error");
		
		LoggerSingleton error2 = LoggerSingleton.getLogger(LoggerType.ERROR);
		error2.log("An error");
		
	}

}
