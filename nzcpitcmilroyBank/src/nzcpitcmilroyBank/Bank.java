package nzcpitcmilroyBank;

import java.util.Date;

public class Bank {

	public static void main(String[] args) {
		System.out.println("Banking Information System");
		Customer cust1 = new Customer("Fred", "Samuel", new Date(1992, 6, 5));
		
		System.out.println(cust1.getName());
		System.out.println(cust1.getDateOfBirth());
		
		Address addrOne = new Address("408", "Harewood","Road", "Bishopdale", 
				"Christchiurch","New Zealand"
				);
		System.out.println(addrOne.get());
		System.out.println();
		System.out.println(addrOne.getLocation());
		System.out.println();
		Address addrTwo = new Address("143", "Madras","Street", "Moorhouse", 
				"Christchiurch","New Zealand");
		System.out.println(addrTwo.get());
		System.out.println();
		System.out.println(addrTwo.getLocation());
		System.out.println();
		CheckAccount account1 = new CheckAccount("0001", 123.45,43.21);
		System.out.println(account1.getId() +"------- "+ account1.getBalance() );
		System.out.println();
		SavingsAccount account2 = new SavingsAccount("001",234.55, 0.04);
		System.out.println(account2.getBalance()+"------- "+ account2.getBalance() );
	}
	
	

}
