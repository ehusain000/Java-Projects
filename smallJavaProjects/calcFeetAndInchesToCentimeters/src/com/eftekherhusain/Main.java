package com.eftekherhusain;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(1,1);
        calcFeetAndInchesToCentimeters(1);
        calcFeetAndInchesToCentimeters(2,2);




    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){



        if (feet >= 0 || inches >= 0 && inches <= 12 ){
            return -1;
        }

        double centimeter = (feet * 12) * 2.54;
        centimeter += feet * 2.54;
        System.out.println(feet + "feet, " + inches+ "inches = " + centimeter + "cm");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            return -1;
        }
        double feet = inches * 12;
        System.out.println(inches + "inches =" + feet + "feet");
        return feet;

    }
}
