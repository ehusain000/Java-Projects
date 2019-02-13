package com.bootcamp01;

import java.util.Scanner;

import org.junit.Test;

public class Palindrome {
	
/* ************************************************************* A2. Palindrome or Not     ***************************************************************************** */
	@Test
	public void palindromeOrNot()
	{
		String enteredWord = ""; //user will input this's variable's value
        @SuppressWarnings("resource")
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

}
