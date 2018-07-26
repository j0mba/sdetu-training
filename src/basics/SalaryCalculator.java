package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//Lets create a variable to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		career = "Software developter";
		System.out.println("My career is:" + career);
		
		// Declare and define
		int hoursweek = 40;
		int weekperyear = 50;
		double rate = 42.50;
		career = "web developter";
		
		double salary = hoursweek * weekperyear * rate;
		System.out.print("My salary as a " + career + "at the rate of $" + rate + "per hour is $" + salary + "per year");
		// Computer our annual salary
		// rate * hoursPerWeek * weekperYear
	}
}
