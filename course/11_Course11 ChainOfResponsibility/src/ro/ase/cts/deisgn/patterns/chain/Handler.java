package ro.ase.cts.deisgn.patterns.chain;

public abstract class Handler {
	protected Handler succesor = null;
	
	public void setSuccessor(Handler succesor){
		this.succesor = succesor;
	}

	public abstract void manageRequest(Message msg);
}
