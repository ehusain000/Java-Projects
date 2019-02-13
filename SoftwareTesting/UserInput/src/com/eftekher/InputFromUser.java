package com.eftekher;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int number;
		System.out.println("Enter a number: ");
		
		number = input.nextInt();
		System.out.println("The number input by the user is: " + number);
		

	}

}
