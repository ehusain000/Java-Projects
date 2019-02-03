package com.eftekherhusain;

public class Main {

    public static void main(String[] args) {

        double firstdouble = 20d;
        double seconddouble = 80d;

        double mysum = (firstdouble + seconddouble ) * 25 ;
        System.out.println( "My Sum is = " + mysum );

        double myremainder = mysum % 40;
        System.out.println("My remainder is = " + myremainder);

        if (myremainder <= 20){
            System.out.println("Total was ove the limit");
        }
        

    }
}
