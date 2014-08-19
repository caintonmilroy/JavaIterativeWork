package nzcpitcmilroyBank;

import java.util.Date;

public class Customer {
	protected String firstName;
	protected String lastName;
	protected Date dateOfBirth;
	public Customer(String firstName, String lastName, Date dateOfBirth){
		/*this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;*/
		setName(firstName, lastName);
		setDateOfBirth(dateOfBirth);
	}
	public boolean setName (String firstName, String lastName){
		boolean ok = false;
		this.firstName = firstName;
		this.lastName = lastName;
		ok = true;
		return ok;
	}
	public String getName(){
		return this.firstName +" " + this.lastName;
	}
	public Boolean setDateOfBirth(Date newDateOfBirth){
		boolean ok = false;
		this.dateOfBirth = newDateOfBirth;
		return ok;
	}
	public String getDateOfBirth(){
		return this.dateOfBirth.toString();
	}
}
