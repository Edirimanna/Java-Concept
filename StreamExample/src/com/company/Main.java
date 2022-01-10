package com.company;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5,6); //create a list
        //demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        //forEach method
        number.stream().map(x->(x*x)+10).forEach(no->
                System.out.println(no));

        //Create String list
        List<String> names= Arrays.asList("Apple","Mango","Banana");
        List<String> results= names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
        System.out.println(results);

        //demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);


    }
}
