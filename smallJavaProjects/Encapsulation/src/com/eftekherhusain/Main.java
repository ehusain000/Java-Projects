package com.eftekherhusain;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50,false);
        System.out.println("initial page counts: " + printer.getNumberOfPages());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was: " + pagesPrinted + " New total print count for printer: " + printer.getNumberOfPages());
         pagesPrinted = printer.printPages(5);
        System.out.println("Pages printed was: " + pagesPrinted + " New total print count for printer: " + printer.getNumberOfPages());


    }
}
