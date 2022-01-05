package com.company;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Dog");
        set.add("Cat");
        set.add("lion");

        //Display LinkHashSet Elements
        System.out.println(set);
        for (String i: set) {
            System.out.println(i);

        }
    }
}
