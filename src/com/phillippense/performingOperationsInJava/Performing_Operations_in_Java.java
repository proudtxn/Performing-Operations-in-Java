package com.phillippense.performingOperationsInJava;

public class Performing_Operations_in_Java {

	public static void main(String[] args) {
	
		int age = 65;
		boolean isStudent = true;
		
		if(age < 0) {
			System.out.println("Invalid Age");
		}
		else if(age >= 65) {
			System.out.println("Ticket Price is $7");
		}
		else if(isStudent == true) {
			System.out.println("Ticket Price is $8");
		}
		else if(age <= 12) {
			System.out.println("Ticket Price is $8");
		}
		else {
			System.out.println("Ticket Price is $10");
		}

	}

}
