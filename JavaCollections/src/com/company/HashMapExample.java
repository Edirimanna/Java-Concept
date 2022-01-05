package com.company;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String args[]){
        HashMap<String,Integer> student= new HashMap<String,Integer>();
        //add name and age
        student.put("Madhusanka",25);
        student.put("Kaml",20);
        //Print values
        System.out.println(student);
        //access value
        System.out.println(student.get("Madhusanka"));

        //use keySet() method
        for(String i : student.keySet()){
            System.out.println(i);
        }


    }
}
