package basics;

public class NumbersCalc {
	
	public static void main(String[] ars) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA,numB);
		int product = multiplyNumber(numA,numB);
		System.out.println("the product of "+numA+" * "+numB+" is: "+product);
	}
	
	static void printName() {
		System.out.println("My name is Lucas");
	}
	
	static void addNumbers(int numberA, int numberB) {
		// this function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of number "+numberA+" + "+numberB+" is "+sum);
	}
	
	static int multiplyNumber(int numberA, int numberB) {
		int product = numberA*numberB;
		addNumbers(product,product);
		return product;
	}
	
}
