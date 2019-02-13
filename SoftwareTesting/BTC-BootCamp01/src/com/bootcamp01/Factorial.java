package com.bootcamp01;

import java.util.Scanner;

import org.junit.Test;

public class Factorial {
	/* ************************************************************** A3. Factorial Value    ******************************************************************************* */
    
    @Test
    public void findFactorial()
    {
    	@SuppressWarnings("resource")
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

}
