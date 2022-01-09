package com.company;

public class ThreadClass {
    public static void main(String[] args) {
        A obj1 =new A();
        B obj2 =new B();
        obj1.start();
        obj2.start();
    }
}
class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Class A");
            try{
                Thread.sleep(400);
            }catch (Exception e){}
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Class B");
            try{
                Thread.sleep(400);
            }catch (Exception e){}
        }
    }
}
