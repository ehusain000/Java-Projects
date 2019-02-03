package com.eftekherhusain;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1,1, 1, 5);
        Cow cow = new Cow("Yorkie", 9, 7, 8, 8);

        cow.eat();
        cow.walk();
        cow.run();



    }
}
