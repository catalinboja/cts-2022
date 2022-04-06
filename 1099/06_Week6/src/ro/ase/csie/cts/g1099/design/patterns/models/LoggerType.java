package ro.ase.csie.cts.g1099.design.patterns.models;

public enum LoggerType {
	ERROR("error.log","*Error*"), INFO("info.log","<Info>");
	
	String filename;
	String messagePattern;
	
	private LoggerType(String filename, String messagePattern) {
		this.filename = filename;
		this.messagePattern = messagePattern;
	}

	public String getFilename() {
		return filename;
	}

	public String getMessagePattern() {
		return messagePattern;
	}
	
	
		
}
