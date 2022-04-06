package ro.ase.csie.cts.g1099.design.patterns.models.singleton.registry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.HashMap;

import ro.ase.csie.cts.g1099.design.patterns.exceptions.InvalidArgumentException;
import ro.ase.csie.cts.g1099.design.patterns.interfaces.ILogging;
import ro.ase.csie.cts.g1099.design.patterns.models.LoggerType;

public class LoggerSingleton implements ILogging{
	
	private static HashMap<LoggerType, LoggerSingleton> loggers = 
			new HashMap<>();
	
	String filename;
	String messagePattern;
	
	File logFile;
	
	private LoggerSingleton(String filename, String messagePattern) throws InvalidArgumentException, IOException {
		if(filename == null || filename.length() < 5) {
			throw new InvalidArgumentException();
		}
		if(messagePattern == null) {
			this.messagePattern = "";
		} else {
			this.messagePattern = messagePattern;
		}
		this.filename = filename;
		
		this.logFile = new File(this.filename);
		if(!logFile.exists()) {
			logFile.createNewFile();
		}
		
	}

	public String getFilename() {
		return filename;
	}

	public String getMessagePattern() {
		return messagePattern;
	}

	@Override
	public void log(String message) {
		try {
			FileWriter writer = new FileWriter(this.logFile, true);
			PrintWriter printWriter = new PrintWriter(writer);
			String log = String.format("%s %s - %s",
					LocalDateTime.now().toString(),
					this.messagePattern,
					message);
			printWriter.println(log);
			printWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static LoggerSingleton getLogger(LoggerType type) {
		LoggerSingleton logger = loggers.get(type);
		
		if(logger  == null) {
			try {
				
				logger = new LoggerSingleton(type.getFilename(), type.getMessagePattern());
				loggers.put(type, logger);
				
			} catch (InvalidArgumentException e) {
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		return logger;
	}

}
