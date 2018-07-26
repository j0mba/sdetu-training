package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordchoice = "Rings";
		bookTitle = "The Lord of the Rings";
		
		if(bookTitle.contains(wordchoice)) {
			System.out.println("The books contains the word Rings");
		}
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstname = "Lucas";
		String lastname = "Sousa Campos"; 
		String SSN = "0092-2020-1";
		
		System.out.println("The number os caracteres of SSN is : "+ SSN.length());
		
		//print the initials plus last 4 digits of SSN
		System.out.print(firstname.substring(0, 1));
		System.out.print(lastname.substring(0, 1));
		System.out.println(SSN.substring(5));
	}
}
