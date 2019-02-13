package com.eftekher;

import java.util.Scanner;

public class dynamicClaculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double number1;
		double number2;
		
		double result;
		
		System.out.println("Enter first number: ");
		
		number1 = input.nextDouble();
		
		System.out.println("Enter second number: ");
		
		number2 = input.nextDouble();
		
		result = number1 + number2;
		System.out.println("Sum is: " + result);
		
		result = number1 - number2;
		System.out.println("Difference is: " + result);
		
		result = number1 * number2;
		System.out.println("Muyltiplication is: " + result);
		
		result = number1 / number2;
		System.out.println("Division is: " + result);

	}

}
