package basics;

public class Days {
	public static void main(String[] args) {
		//execute different block of code based on the value condition
		
		String dayofweek = "Tuesday";
		
		switch (dayofweek) {
		case "Monday" :
			System.out.println("Today is monday");
			break;
		case "Tuesday" :
			System.out.println("Today is Tuesday");
		case "Wednesday" :
			System.out.println("Today is Wednesday");
		default : System.out.println("Error!");
		}
	}
}
