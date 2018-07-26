package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class Demo {
	public static void main(String[] args) {
		// instantiating an object
		Person person1 = new Person();
		
		// define properties
		person1.name = "joe";
		person1.email = "joe@com";
		person1.phone = "123981";
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		
		//define
		person2.name = "marilia";
		person2.email = "marilia@com";
		person2.phone = "231310";
		
		// Abstraction
		person2.walk();
		person2.eat();
		/*
		//person
		String name = "joe";
		String email = "joe@gmail";
		String phone = "209839";

		walking(name);
		System.out.println(name + " is eating");
		
		// what if we wanted to do for other person?
		String name2 = "Sara";
		String email2 = "sara@gmail";
		String phone2= "2031239";
		
		// Action, activity, behavior
		walking(name2);
		System.out.println(name2 + " is eating");
		
		//What about binding attributes and properties together?
		// Enhance by adding function to minimze code
		static void walking(String name) {
		System.out.println(name + " is walking");
	}

		 */
	}
		
}

