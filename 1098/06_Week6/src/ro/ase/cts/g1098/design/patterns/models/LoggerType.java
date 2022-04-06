package ro.ase.cts.g1098.design.patterns.models;

public enum LoggerType {
	
	ERROR("errors.log","*Error*"), INFO ("info.log", "<<Info>>");
	
	private String fileName;
	private String logPattern;
	
	private LoggerType(String fileName, String logPattern) {
		this.fileName = fileName;
		this.logPattern = logPattern;
	}

	public String getFileName() {
		return fileName;
	}

	public String getLogPattern() {
		return logPattern;
	}
	
	
	

}
