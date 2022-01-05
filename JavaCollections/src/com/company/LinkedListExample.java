package com.company;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String args[]){
        LinkedList<String> animal=new LinkedList<String>();

        //adding element to the Linked list
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Crow");
        animal.addFirst("lion");
        animal.addLast("Rabbit");
        System.out.println(animal);

        //Remove index 2 element
        animal.remove(2);
        //Display after remove element
        for (String i:animal) {
            System.out.println(i);
        }
    }
}
