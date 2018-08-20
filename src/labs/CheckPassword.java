package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CheckPassword {

	public static void main(String[] args) {
		String filename = "C:\\Users\\LUCAS\\Dropbox\\java\\Files\\PasswordToRead.txt";
		File file = new File(filename);
		String[] passwords = new String[13];
		String password = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i=0; i<passwords.length;i++) {
				passwords[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Could not read file: " + filename);
			e.printStackTrace();
		}
		
		
		// This will read a text file and will retrieve password 
		// Valid password: 
			// check if has a number
			// check if has a letter
			// check if has a special character(!@#)
		for(int i=0;i<passwords.length;i++) {
			boolean condition_num = true;
			boolean condition_str = true;
			boolean condition_esp = true;
			password = passwords[i];
			try {
			for(int k=0;k<password.length();k++) {
				if(password.substring(k,k+1).matches("\\d+")) {
					condition_num = false;	
				}
				if(password.substring(k,k+1).matches("\\w+")){
					condition_str = false;
				}
				if(password.substring(k,k+1).matches("[!@#$%^&*(),.?\":{}|<>]")){
					condition_esp = false;
				}
			}
			if(condition_num) {
				throw new NumberException(password);
			}
			
			if(condition_str){
				throw new CaracterException(password);
			}
			
			if(condition_esp) {
				throw new SpecialException(password);
			}
							
			System.out.println(password);
			} catch(NumberException e) {
				System.out.println("Error: password does not have a number");
				System.out.println(e.toString());
			} catch(CaracterException e) {
				System.out.println("Error: password does not have a caracter");
				System.out.println(e.toString());
			} catch(SpecialException e) {
				System.out.println("Error: password does not have a special caracter");
				System.out.println(e.toString());
			}
		}
	}
}

class NumberException extends Exception{
	String pass;
	NumberException(String pass){
		this.pass = pass;
	}
	public String toString() {
		return ("NumberException: " + pass);
	}
}

class CaracterException extends Exception{
	String pass;
	CaracterException(String pass){
		this.pass = pass;
	}
	public String toString() {
		return ("CaracterException: " + pass);
	}
}

class SpecialException extends Exception{
	String pass;
	SpecialException(String pass){
		this.pass = pass;
	}
	public String toString() {
		return ("SpecialException: " + pass);
	}

}
