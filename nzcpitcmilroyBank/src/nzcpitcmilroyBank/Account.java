package nzcpitcmilroyBank;

public abstract class Account {
	protected String id;
	protected Double balance;
	
	
	public boolean credit(){
		return this.balance > 0;
	}
	public boolean debit(){
		return this.balance < 0;
	}
	public double getBalance(){
		return this.balance;
	}
	public String getId(){
		return this.id;
	}
	public Account(String id, double openingBalance){
		this.id = id;
		this.balance = openingBalance;
	}
}
