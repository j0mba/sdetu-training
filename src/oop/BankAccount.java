package oop;

public class BankAccount implements IRate {
	
	// define variables
	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final >> constant (often static final)
	private static final String routingNumber = "123456";
	
	// instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// constructor definitions
		// 1. They are to define/setup/initialize properties of an object
		// 2. Constructors are IMPLICITY called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have no return type
	BankAccount(){
		System.out.println("New Account Created");
	}
	// Overloading: Call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("New Account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		//initDeposit, accountType, Msg are all local variables
		System.out.println("New Account: " + accountType);
		System.out.println("Initial deposit of: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Minimum deposit must be at least $1.000";
		} else {
			Msg = ("Thanks for your initial deposit of: $" + initDeposit);
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getters / Setters
	
	// Allow user to define the name
	public void setName(String name) {
		this.name = "Mrs." + name;
	}
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	// define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	// Private : can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Your Recent Transaction: " + activity);
		System.out.println("Your new balance is: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ Name " + name + ". Account#" + accountNumber + ". Routing#"+ routingNumber + " Balance: $" + balance + "]";
	}
}
