package com.company;

class AbstractExample {
    public static void main(String args[]){
        // Create a Pig object
        Bus bus = new Bus();
        bus.vehicleSound();
    }
}
// Abstract class
abstract class Vehicle {
    // Abstract method
    public abstract void vehicleSound();
}

// Subclass
class Bus extends Vehicle {
    public void vehicleSound() {
        System.out.println("high");
    }
}
