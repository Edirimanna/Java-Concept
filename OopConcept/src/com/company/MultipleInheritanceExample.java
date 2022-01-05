package com.company;

public class MultipleInheritanceExample {
    public static void main(String args[]){
        Anima kamal=new Anima();
        kamal.eat();
        kamal.travel();
    }
}
interface AnimalEat{
    void eat();
}
interface AnimalTravel{
    void travel();
}
class Anima implements AnimalEat,AnimalTravel{
    public void eat(){
        System.out.println("Eating");
    }
    public void travel(){
        System.out.println("Traveling");
    }
}


