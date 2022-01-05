package com.company;

public class InheritanceExample {
    public static void main(String args[]){
        //Crow crow=new Crow();
        BabyCrow babyCrow=new BabyCrow();
        babyCrow.eat();
        babyCrow.fly();
        babyCrow.weep();
    }
}
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Crow extends Animal{
    void fly(){
        System.out.println("Fly...");
    }
}
class BabyCrow extends Crow{
    void weep(){
        System.out.println("Weep...");
    }
}
