package com.eftekherhusain;

public class Cow extends Animal {

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;


    public Cow(String name, int brain, int body, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
    }

    @Override
    public void eat() {
        System.out.println("Cow.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Cow.walk() called");
        move(5);
    }
    public void run(){
        System.out.println("Cow.run() called");
        move(10);
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }
}
