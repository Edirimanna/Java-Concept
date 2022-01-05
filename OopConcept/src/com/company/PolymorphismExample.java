package com.company;

public class PolymorphismExample {
    public static void main(String args[]){
        Crows crow=new Crows();
        crow.walk();
    }
}
class Animals{
    public void walk(){
        System.out.println("On The Road");
    }
}
class Crows extends Animals{
    public void walk(){
        System.out.println("On The Three");
    }
}
