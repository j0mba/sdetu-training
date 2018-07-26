package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account

		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "tala";
		// with Encapsulation : public API methods
		acc1.setName("Tathon");
		System.out.println(acc1.getName());
		acc1.setSsn("123213");
		System.out.println("SSN is: " + acc1.getSsn());
		acc1.accountNumber = "3219891";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);

		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading 
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "2349801";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "12309012";
		acc3.checkBalance();

		/*
		// demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
	}

}
