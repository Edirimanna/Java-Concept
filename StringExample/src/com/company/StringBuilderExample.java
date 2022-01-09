package com.company;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder =new StringBuilder("Hello ");
        stringBuilder.append("java"); //original string is changed
        System.out.println(stringBuilder);

        StringBuilder sb1 =new StringBuilder("Hello ");
        sb1.insert(1,"java");
        System.out.println(sb1);

        StringBuilder sb2 =new StringBuilder("Hello ");
        sb2.delete(1,4);
        System.out.println(sb2);

        StringBuilder sb3 =new StringBuilder("Hello ");
        sb3.reverse();
        System.out.println(sb3);
    }
}
