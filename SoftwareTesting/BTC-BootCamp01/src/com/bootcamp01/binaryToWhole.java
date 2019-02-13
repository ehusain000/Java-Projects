package com.bootcamp01;

import java.util.Scanner;

import org.junit.Test;

public class binaryToWhole {
	/* ************************************************************* A1. Binary To Whole Number **************************************************************************** */
	@Test
	public void binaryToWholeNumber()
	{
		
		@SuppressWarnings("resource")
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

}
