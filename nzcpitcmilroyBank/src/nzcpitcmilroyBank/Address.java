package nzcpitcmilroyBank;

public class Address {
	protected String streetNumber;
	protected String streetName;
	protected String streetType;
	protected String suburb;
	protected String city;
	protected String country;
	
	public Address(String streetNumber, String streetName,
			String streetType,String suburb,String city,String country ){
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.streetType = streetType;
		this.suburb = suburb;
		this.city = city;
		this.country = country;
	}
	public String get(){
		return this.streetName + " " + this.streetNumber + " " + this.streetType
				+
				"\n" + this.suburb +
				"\n" + this.city +
				"\n" + this.country;
	}
	public String getLocation(){
		return this.streetName + " " + this.streetNumber + " " + this.streetType;
	}
	
	
}
