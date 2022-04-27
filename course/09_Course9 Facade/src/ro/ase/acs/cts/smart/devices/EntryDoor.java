package ro.ase.acs.cts.smart.devices;

public class EntryDoor {
	protected boolean isClosed = true;
	
	public void close(){
		this.isClosed = true;
	}
	
	public void open(){
		this.isClosed = false;
	}

}
