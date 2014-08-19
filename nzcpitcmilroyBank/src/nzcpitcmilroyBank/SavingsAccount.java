package nzcpitcmilroyBank;

public class SavingsAccount extends Account {
	protected double interestRate;
	public SavingsAccount(String id, double openingBalance ,double interestRate) {
			super(id, openingBalance);
			this.interestRate = interestRate;
	}
	public double getInterestRate(){
		return this.interestRate;
	}
	public boolean setInterestRate(double newRate){
		boolean rateOk = false;
		if(newRate > 0){
			this.interestRate = newRate;
			rateOk = true;
		}
		return rateOk;
	}

}
