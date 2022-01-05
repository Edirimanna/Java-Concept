package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class ArryListExample {
    public static void main(String args[]){
        ArrayList<String> animal=new ArrayList<String>();
        ArrayList<Integer> num=new ArrayList<Integer>();

        //Add data
        animal.add("Dog");
        animal.add("Cat");
        animal.set(1,"crow");

        num.add(10);
        num.add(20);
        num.add(6);

        System.out.println("String ArryList");
        //Display numbers
        for(int i=0;i<animal.size();i++){
            System.out.println(animal.get(i));
        }
        //Sort numbers
        System.out.println("Integer ArryList");
        Collections.sort(num);
        //Display Numbers
        for(int i: num){
            System.out.println(i);
        }

    }
}
