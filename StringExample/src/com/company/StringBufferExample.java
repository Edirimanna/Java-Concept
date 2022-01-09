package com.company;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Hello ");
        sb.append("String Buffer..."); //String is changed
        System.out.println(sb);

        sb.insert(2,"java");  //changed original String
        System.out.println(sb);

        sb.replace(1,3,"Java");
        System.out.println(sb);

        sb.delete(1,3);  //delete
        System.out.println(sb);

        sb.reverse(); //reverse word
        System.out.println(sb);
    }

}
