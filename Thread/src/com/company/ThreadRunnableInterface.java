package com.company;

public class ThreadRunnableInterface {
    public static void main(String[] args) {
        ClassA obj1 =new ClassA();
        ClassB obj2 =new ClassB();
        Thread thread1 =new Thread(obj1);
        Thread thread2 =new Thread(obj2);
        thread1.start();
        thread2.start();
    }
}
class ClassA implements Runnable{
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("class A");
            try{
                Thread.sleep(400);
            }catch (Exception e){}
        }

    }
}
class ClassB implements Runnable{
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("class B");
            try{
                Thread.sleep(400);
            }catch (Exception e){}
        }
    }
}
