package basics;

public class Weather {
	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on the weather (temperature)
		
		int temperature = 61;
		String sunCondition = "Sunny";
		
		if(temperature > 80) {
			System.out.println("It's pleasent. Wear shorts or t-shirt");
		}
		else if((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler. Perhaps wear a long shirt and jeans");
		}
		else {
			System.out.println("look like a cold day. Bring a sweather");
		}
	}
}	
