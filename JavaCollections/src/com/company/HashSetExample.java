package com.company;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> animal=new HashSet<String>();
        animal.add("Dog");
        animal.add("Cat");
        System.out.println(animal);

        //using for-each loop
        for(String i:animal){
            System.out.println(i);
        }
    }
}
