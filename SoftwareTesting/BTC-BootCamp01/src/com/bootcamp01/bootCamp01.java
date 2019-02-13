package com.bootcamp01;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class bootCamp01 {

/* ************************************************************* A1. Binary To Whole Number **************************************************************************** */
	@Test
	public void binaryToWhole()
	{
		
		Scanner input = new Scanner(System.in);// used for user to enter values. It's predetermined by java.
        /* */
        String binaryNumber = ""; //string value will change
        /* */
        while ((binaryNumber == "" || binaryNumber != ""))
        {
                System.out.println("Enter a binary number: "); //asks user to enter a value
                binaryNumber = input.nextLine(); //system takes the string value in
                /* */
                System.out.println("The number was: " + binaryNumber);
                //tells the user what has been taken in the system

                int wholeNumber = Integer.parseInt(binaryNumber, 2);
                /* parseInt is used to convert string to integer*/
                System.out.println("After converting to whole number, The number became: " + wholeNumber);
                binaryNumber = binaryNumber + 1;
                /* Use to continue the loop until command to break*/
        }
	}
	
/* ************************************************************* A2. Palindrome or Not     ***************************************************************************** */
	@Test
	public void palindrome()
	{
		String enteredWord = ""; //user will input this's variable's value
        Scanner in = new Scanner(System.in); // used for user to enter values. It's predetermined by java.

        while (enteredWord == "" || enteredWord != "")
        {

            System.out.println("Enter a string: "); //program asks user to enter a number
            enteredWord = in.nextLine(); //program takes the string value entered by user. nextLine() is used for string value input

            int length = enteredWord.length(); //returns the length of the sequence of characters represented by the object.
            int i, begin, end, middle; //variable declared for future use.

            begin = 0; // the value will be changed according to user input
            end = length - 1; //subtruct 1 character from total length of the string entered. if length is 13 then value of end is 12.
            middle = (begin + end) / 2; // for example: (0 + 12)/ 2 would be 6.

            for (i = begin; i <= middle; i++)
        /* *
         * using for loop. i is made equal to begin value.
         * If i is less then or equal to middle value then
         * run whatever is inside the loop. increament i by 1
         * */ {
                if (enteredWord.charAt(begin) == enteredWord.charAt(end))
                /* if entered string's begin index is equal to it'd end index then do what's inside. */
            /* charAt() method returns a charactrer at the specified index. */ {
                    begin++; //increament begin by one
                    end--; //decreament end by one
                } else {
                    break; //if condition not met, then break the statement
                }
            }
            if (i == middle + 1)

            {
                System.out.println("String is Palindrome!");
            } else {
                System.out.println("String is not a palindrome!");
            }
            enteredWord = enteredWord +1;

        }
	}
	
        
/* ************************************************************** A3. Factorial Value    ******************************************************************************* */
        
        @Test
        public void factorial()
        {
        	Scanner input = new Scanner(System.in);

            int number = 0;

            while (number >= 0) {
                System.out.println("Enter a Number: ");
                number = input.nextInt();
                int result = 1;

                for (int i = 1; i <= number; i++) {
                    result = result * i;
                }
                System.out.println("The factorial of " + number + " is " + result);
                number = number + 1;
            }
        	
        }
        
        
/* *************************************************************** A4.Fibonacci Number    ******************************************************************************* */
        
        @Test
        public void fibonacci()
        {
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
        
/* ********************************************************** A5. Duplicate Character from a String  ****************************************************************** */
        
        @Test
        public void duplicateCharacter()
        {
        	Scanner input = new Scanner(System.in);

            String enteredString = "";
            System.out.println("Enter a String: ");


            while (enteredString == "" || enteredString != "") {

                enteredString = input.next();

                HashMap <Character, Integer> map = new HashMap <> ();

                //Convert the String to char array
                char[] chars = enteredString.toCharArray();


                /* logic: char are inserted as keys and their count
                 * as values. If map contains the char already then
                 * increase the value by 1
                 */
                for (Character ch : chars) {
                    if (map.containsKey(ch)) {
                        map.put(ch, map.get(ch) + 1);
                    } else {
                        map.put(ch, 1);
                    }
                }

                //Obtaining set of keys
                Set <Character> keys = map.keySet();


                /* Display count of chars if it is
                 * greater than 1. All duplicate chars would be
                 * having value greater than 1.
                 */
                for (Character ch : keys) {
                    if (map.get(ch) > 1) {
                        System.out.println("Char " + ch + " " + map.get(ch));
                    }
                }

                System.out.println("String: " + enteredString);
                System.out.println("-------------------------");

                enteredString = enteredString + 1;
                System.out.println("Enter another string: ");

            }
        	
        }
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
