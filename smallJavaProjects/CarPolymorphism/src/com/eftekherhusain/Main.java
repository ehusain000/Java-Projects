package com.eftekherhusain;

 class Car{
     private boolean engine;
     private int cylinders;
     private String name;
     int wheels;

     public Car(int cylinders, String name) {
         this.cylinders = cylinders;
         this.name = name;
         this.wheels = 4;
         this.engine = true;
     }

     public int getCylinders() {
         return cylinders;
     }

     public String getName() {
         return name;
     }

     public String startEngine(){
         return "Car -> startEngine()";

     }
     public String accelerate(){
         return "Car -> accelerate()";

     }
     public String brake(){
         return "Car -> brake()";
     }

 }


class Honda extends Car{
    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Honda -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Honda -> accelerate()";
    }

    @Override
    public String brake() {
        return "Honda -> brake()";
    }
}




public class Main {

    public static void main(String[] args) {
        Car car = new Car(4,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }

    Honda honda = new Honda(4,"Civic");
    

}
