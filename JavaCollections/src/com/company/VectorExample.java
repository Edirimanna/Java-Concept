package com.company;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<String>();
        //adding element to a vector
        vector.add("Dog");
        vector.add("Cat");
        vector.add("crow");

        //display vector elements
        System.out.println("Vector element is:"+vector);

        for (String i: vector) {
            System.out.println(i);
        }
        //Remove the elements at index 1
        vector.remove(1);
        //After remove element display
        System.out.println("Vector element is:"+vector);
    }
}
