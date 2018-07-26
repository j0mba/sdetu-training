package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"São josé", "Afogados", "Tabira", "Teixeira"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// declare the array
		String[] countries;
		
		// define the array
		countries = new String[3];
		countries[0] = "Brasil";
		countries[1] = "Peru";
		countries[2] = "Gluglu";
		System.out.println(countries[2]);
		
		System.out.println("*********************");
		
		// Declare the array
		String[] states = new String[5];
		states[0] = "Balada";
		states[1] = "Paixao";
		states[2] = "Amor";
		states[3] = "Vigarista";
		states[4] = "Me ajude";
		int i = 0;
		
		// Do loop: enter the loop then tests condition
		do {
			System.out.println("amores : " +states[i]);
			i = i + 1;
		} while(i < 5);
		
		System.out.println("*********************");
		
		// while : tests firsts
		int n = 0;
		boolean statefound = false;
		while(!statefound) {
			String state = states[n];
			System.out.println(state);
			if(state == "Amor") {
				System.out.println("State found");
				statefound = true;
			}
			n++;
		}
		System.out.println("Printing for loop\n");
		//for loop: best structure to iterating through an array
		for(int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
	}

}
