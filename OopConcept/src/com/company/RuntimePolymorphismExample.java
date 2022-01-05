package com.company;

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        Car car;
        car=new Toyota();
        car.manufacturedCountry();
        car=new Chery();
        car.manufacturedCountry();
        car=new Audi();
        car.manufacturedCountry();
    }
}
class Car{
    void manufacturedCountry(){
        System.out.println("country...");
    }
}
class Toyota extends Car{
    void manufacturedCountry(){
        System.out.println("Japan...");
    }
}
class Chery extends Car{
    void manufacturedCountry(){
        System.out.println("China...");
    }
}
class Audi extends Car{
    void manufacturedCountry(){
        System.out.println("German...");
    }
}