package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("4534123", 1000.50);
		BankAccount acc2 = new BankAccount("1323123", 2000);
		BankAccount acc3 = new BankAccount("5453664", 3000);
		
		acc1.setName("Taron");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.ToString());
	}

}

class BankAccount implements IInterest{
	// Properties of the bank account
	private static int iD = 1000;  // internal ID
	private String accountNumber;   // iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "0092108329";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		this.SSN = SSN;
		balance = initDeposit;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your account number is: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance is: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1+rate/100);
		showBalance();
	}
		
	public String ToString() {
		return " [ Name: " + name + "]\n [ Account Number: " + accountNumber + "]\n [Routing Number: " + routingNumber + "]\n [Balance: " + balance + " ]"; 
	}
	
	
	
}