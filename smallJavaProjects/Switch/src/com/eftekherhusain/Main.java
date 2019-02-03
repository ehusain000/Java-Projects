package com.eftekherhusain;

public class Main {

    public static void main(String[] args) {

        /* Example of Switch statement by char */
        int switchInt = 5;

        switch(switchInt){
            case 1:
            case 2:
            case 3: case 4: case 5:
                System.out.println("Value was " + switchInt);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }
        /* Example of Switch statement by char */
        char switchChar = 'E';

        switch(switchChar){
            case 'A':

            case 'B':
            case 'C': case 'D': case 'E':
                System.out.println("Value was " + switchChar);
                break;
            default:
                System.out.println("Value was not A, B, C, D or E");
                break;
        }
        /* Example of Switch statement by String */
        String switchString = "march";
        switch (switchString.toLowerCase()){
            case "january":
            case "february":
            case "march":
            case "april":
            case "may":
            case "june":
            case "july":
            case "august":
            case "september":
            case "october":
            case "november":
            case "december":
                System.out.println("The month was " + switchString);
                break;
            default:
                System.out.println("sorry! could not find a Month");
                break;
        }

    }
}
