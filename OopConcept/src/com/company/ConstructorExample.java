package com.company;

public class ConstructorExample {
    String name;
    int age;

    //Default Constructor
    ConstructorExample(){
        this.name="siri";
        this.age=20;
    }
    //parameterized constructor
    ConstructorExample(String n,int a){
        this.name=n;
        this.age=a;

    }
    public static void main(String[] args) {
        ConstructorExample obj1= new ConstructorExample();
        ConstructorExample obj2= new ConstructorExample("piti",10);

        System.out.println("Name: "+obj1.name +" Age: "+obj1.age);
        System.out.println("Name: "+obj2.name +" Age: "+obj2.age);

    }
}
