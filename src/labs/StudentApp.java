package labs;

public class StudentApp {

	public static void main(String[] args) {
		
		student st1 = new student("Lucas", "123124", 2500);
		student st2 = new student("Tathi", "423124", 3000); 
		st1.showCourses();
		st1.enroll();
		st1.CheckBalance();
		
		st1.setUserID();
		st2.setUserID();
		st1.pay(500);
		// set arguments
		st1.setCity("São josé");
		st1.setPhone("919221");
		st1.setState("Pernambuco");
		
		//get arguments
		st1.getCity();
		st1.getPhone();
		st1.getState();
		
		//ToString
		
		System.out.println(st1.ToString());
	}

}

class student{
	
	// Properties
	private String name;
	private String SSN;
	private String email;
	private static int ID = 0;
	private String emailID;
	private String userID;
	private String phone;
	private String city;
	private String state;
	private double balance;


	// Constructor
	public student(String name, String SSN, double initDeposit) {
		this.name = name;
		this.SSN = SSN;
		this.emailID = name + SSN + "@gmail.com";
		balance = initDeposit;
		ID++;
	}
	public void setUserID(){
		int random = (int)(Math.random() * 10000);
		userID = ID + "" + random + SSN.substring(SSN.length() - 4);
	}
	public void enroll() {
		System.out.println("Enroll created sucessfully");
	}
	
	public void showCourses() {
		System.out.println("The coursers are: Math and Fis");
	}
	// Encapsulation
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhone() {
		return phone;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	
	public void CheckBalance() {
		System.out.println("Balance is: " + balance);
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("Payming amout: " + amount);
		CheckBalance();
	}
	// ****************************
	public String ToString() {
		return "[Name: " + name + "]\n[user ID: " + userID + "]\n[Phone: " + phone + "]";
	}
}
