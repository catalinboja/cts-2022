package ro.ase.cts.g1098.design.patterns.models;

import java.io.IOException;
import java.util.HashMap;

import ro.ase.cts.g1098.design.patterns.exceptions.MissingInputArgException;
import ro.ase.cts.g1098.design.patterns.interfaces.ILogging;

public class LoggerGenerator {
	private static HashMap<LoggerType, ILogging> loggers = new HashMap<>();
	
	public static ILogging getLogger(LoggerType type) throws IOException {
		ILogging logger = loggers.get(type);
		if(logger == null) {
			try {
				
				logger = Logger.getLogger(type.getFileName(), type.getLogPattern());
				loggers.put(type, logger);
				
			} catch (MissingInputArgException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		return logger;
	}
	
}
