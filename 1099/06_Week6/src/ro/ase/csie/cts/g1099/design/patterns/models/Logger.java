package ro.ase.csie.cts.g1099.design.patterns.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.time.LocalDateTime;

import ro.ase.csie.cts.g1099.design.patterns.exceptions.InvalidArgumentException;
import ro.ase.csie.cts.g1099.design.patterns.interfaces.ILogging;

public class Logger implements ILogging{
	

	String filename;
	String messagePattern;
	
	File logFile;
	
	Logger(String filename, String messagePattern) throws InvalidArgumentException, IOException {
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
}
