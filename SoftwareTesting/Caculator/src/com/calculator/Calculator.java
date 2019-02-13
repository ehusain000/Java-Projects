package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner write = new Scanner(System.in); // used for input
		
		double firstValue;
		double secondValue;
		
		double result;
		
		System.out.println("Enter your first Value: ");
		firstValue = write.nextDouble();
		
		System.out.println("Enter your second Value: ");
		secondValue = write.nextDouble();
		
		result = firstValue * secondValue;
		
		System.out.println("The multiplication of these values were: " + result);
		
		result = firstValue / secondValue;
		
		System.out.println("The division of these values were: " + result);
		
		result = firstValue + secondValue;
		
		System.out.println("The addtion of these values were: " + result);
		
		result = firstValue - secondValue;
		
		System.out.println("The substraction of these values were: " + result);
		
	
		

	}

}
