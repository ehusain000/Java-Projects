package com.eftekherhusain;

public class Main {

    public static void main(String[] args) {

        int number = 5;
        int finishNumber = 20;
        int count = 0;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
            count++;
            if(count == 5){
                System.out.println("Even number found: " + count);
                break;
            }
        }
    }


    public static boolean isEvenNumber( int i){
        if ( (i % 2) == 0){
            return true;
        }
        else{
            return false;
        }
    }


}



