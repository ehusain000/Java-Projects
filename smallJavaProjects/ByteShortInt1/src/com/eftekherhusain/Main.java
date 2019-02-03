package com.eftekherhusain;

public class Main {

    public static void main(String[] args) {

 byte quizbytevalue = -126;
        System.out.println("My byte value is = " + quizbytevalue);
 short quizshortvalue = 120;
        System.out.println("My short value is = " + quizshortvalue);
 int myint = 1000;
        System.out.println("My int value is = " + myint);
 long mylong = 50000L + 10L * (quizbytevalue + quizshortvalue + myint);
        System.out.println("My long then would be = " + mylong);



    }
}
