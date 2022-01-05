package com.company;

public class ClassExample {
        String name;
        String size;
        int age;
        String color;

    public String getInfo() {
        return ("Name is:"+name+" Size is:"+size+" Age is:"+age+" color is: "+color);
    }
    public static void main(String[] args) {
        ClassExample cat =new ClassExample();
        cat.name="siri";
        cat.age=10;
        cat.color="red";
        cat.size="large";
        System.out.println(cat.getInfo());
    }
}


