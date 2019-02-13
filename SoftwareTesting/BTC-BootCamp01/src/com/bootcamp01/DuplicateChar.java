package com.bootcamp01;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import org.junit.Test;

public class DuplicateChar {
	/* ********************************************************** A5. Duplicate Character from a String  ****************************************************************** */
    
    @Test
    public void findDuplicateCharacter()
    {
    	@SuppressWarnings("resource")
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
