package nzcpitcmilroyBank;

public class CheckAccount extends Account {
	
	protected double overDraft = 0.0;
	
	public CheckAccount(String id, double openingBalance, 
			double overDraft ) {
		super(id, openingBalance);
		this.overDraft = overDraft;
	}
	public double getOverDraft(){
		return this.overDraft;
	}
	public boolean setOverDraft (double newOverDraft){
		boolean ok = false;
		if(newOverDraft > 0){
			this.overDraft = newOverDraft;
			ok = true;
		}
		return ok;
	}	
}
