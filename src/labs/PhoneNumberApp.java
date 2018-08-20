package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {

		String filename = "C:\\Users\\LUCAS\\Dropbox\\java\\Files\\PhoneNumber.txt";
		File file = new File(filename);
		String[] phoneNums = new String[7];
		String phoneNum = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0; i<phoneNums.length;i++) {
				phoneNums[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Could not read file: " + filename);
			e.printStackTrace();
		}
		
		
		// This will read a text file and will retrieve phone number
		// Valid phone number: 
			// 10 digits long
			// Area code cannot start in 0 or 9
			// There can be 911 in the phone
		for(int i=0;i<phoneNums.length;i++) {
			phoneNum = phoneNums[i];
			try {
			if(phoneNum.length() != 10) {
				throw new TenDigitsException(phoneNum);
			}
			if(phoneNum.substring(0, 1).equals("0") || phoneNum.substring(0, 1).equals("9")){
				throw new AreaCodeException(phoneNum);
			}
			for(int n=0; n<phoneNum.length() -2 ;n++) {
				if(phoneNum.substring(n, (n+1)).equals("9")) {
					if(phoneNum.substring((n+1), (n+3)).equals("11")) {
						throw new EmergencyException(phoneNum);
					}
					
				}
			}
			System.out.println(phoneNum);
			} catch(TenDigitsException e) {
				System.out.println("Error: Phone number is not ten digits");
				System.out.println(e.toString());
			} catch(AreaCodeException e) {
				System.out.println("Error: Phone number has invalid area code");
				System.out.println(e.toString());
			} catch(EmergencyException e) {
				System.out.println("Error: Invalid 911 sequence found");
				System.out.println(e.toString());
			}
		}
	}
}

class TenDigitsException extends Exception{
	String number;
	TenDigitsException(String number){
		this.number = number;
	}
	public String toString() {
		return ("TenDigitsException: " + number);
	}
}

class AreaCodeException extends Exception{
	String number;
	AreaCodeException(String number){
		this.number = number;
	}
	public String toString() {
		return ("AreaCodeException: " + number);
	}
}

class EmergencyException extends Exception{
	String number;
	EmergencyException(String number){
		this.number = number;
	}
	public String toString() {
		return ("EmergencyException: " + number);
	}
}