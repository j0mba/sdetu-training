package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers 
		// Fib(0) = 0
		// Fib(1) = 1
		// Fib(2) = 0 + 1 = 1
		// Fib(3) = 1 + 1 = 2
		// Fib(4) = 2 + 1 = 3
		System.out.println(fib(5));
		System.out.println(fat(5));
		System.out.println(sum(5));
	}
	// fibonnaci serie
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
	// fatorial
	public static int fat(int n) {
		if (n == 0) {
			return 1;
		}
		return (fat(n-1)*(n));
	}
	// som 
	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return sum(n-1)+n;
	}
}
