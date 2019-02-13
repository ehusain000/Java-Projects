package com.bootcamp01;

import java.util.Scanner;

import org.junit.Test;

public class FibonacciNumber {
	/* *************************************************************** A4.Fibonacci Number    ******************************************************************************* */
    
    @Test
    public void findFibonacciNumber()
    {
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        // input to print Fibonacci series upto how many numbers
        int number;
        System.out.println("How many fibonacci number you want to print: ");
        number = input.nextInt();
        System.out.println("Using Recursion. Provided Number: " + number);


        for (int i = 1; i <= number; i++)
        {
            System.out.println(fibonacciRecusion(i) + " ");
        }

        System.out.println("Fibonacci number at location " + number + " is => " + (fibonacciLoop(number) + ""));

    }

    // Method-1: Java program for Fibonacci number using recursion.
    public static int fibonacciRecusion(int number)
    {
        if (number == 1 || number == 2)
        {
            return 1;
        }
        return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
    }

    // Method-2: Java program for Fibonacci number using Loop.
    public static int fibonacciLoop(int number)
    {
        if (number == 1 || number == 2)
        {
                return 1;
        }

        int fibo1 = 1, fibo2 = 1, fibonacci = 1;

        for (int i = 3; i <= number; i++)
        {
            fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }   return fibonacci; // Fibonacci number
    	
    }

}
